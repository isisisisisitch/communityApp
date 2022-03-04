package ca.bytetube.communityApp.service.impl;

import ca.bytetube.communityApp.dao.ShopDao;
import ca.bytetube.communityApp.dto.ImageHolder;
import ca.bytetube.communityApp.dto.ShopExecution;
import ca.bytetube.communityApp.entity.Shop;
import ca.bytetube.communityApp.enums.ShopStateEnum;
import ca.bytetube.communityApp.exceptions.ShopOperationException;
import ca.bytetube.communityApp.service.ShopService;
import ca.bytetube.communityApp.util.ImageUtil;
import ca.bytetube.communityApp.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;


@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopDao shopDao;


	@Override
	@Transactional
	public ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException {
		// 空值判断
		if (shop == null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			// 给店铺信息赋初始值
			shop.setEnableStatus(0);
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());

			// 添加店铺信息
			int effectedNum = shopDao.insertShop(shop);
			if (effectedNum <= 0) {
				throw new ShopOperationException("Failed to create a shop");
			} else {
				if (thumbnail.getImage() != null) {
					// 存储图片
					try {
						addShopImg(shop, thumbnail);
					} catch (Exception e) {
						throw new ShopOperationException("addShopImg error:" + e.getMessage());
					}
					// 更新店铺的图片地址
					effectedNum = shopDao.updateShop(shop);
					if (effectedNum <= 0) {
						throw new ShopOperationException("Failed to update image address");
					}
				}
			}
		} catch (Exception e) {
			throw new ShopOperationException("addShop error:" + e.getMessage());
		}
		return new ShopExecution(ShopStateEnum.CHECK, shop);
	}

	private void addShopImg(Shop shop, ImageHolder thumbnail) {
		// 获取shop图片目录的相对值路径
		String dest = PathUtil.getShopImagePath(shop.getShopId());
		String shopImgAddr = ImageUtil.generateThumbnail(thumbnail, dest);
		shop.setShopImg(shopImgAddr);
	}
}
