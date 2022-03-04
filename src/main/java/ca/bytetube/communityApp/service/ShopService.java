package ca.bytetube.communityApp.service;

import ca.bytetube.communityApp.dto.ImageHolder;
import ca.bytetube.communityApp.dto.ShopExecution;
import ca.bytetube.communityApp.entity.Shop;
import ca.bytetube.communityApp.exceptions.ShopOperationException;

public interface ShopService {

	/**
	 * 注册店铺信息，包括图片处理
	 */
	ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
