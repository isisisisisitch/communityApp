package ca.bytetube.community.dao;

import ca.bytetube.community.BaseTest;
import ca.bytetube.communityApp.dao.ShopDao;
import ca.bytetube.communityApp.entity.Area;
import ca.bytetube.communityApp.entity.PersonInfo;
import ca.bytetube.communityApp.entity.Shop;
import ca.bytetube.communityApp.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;


import static org.junit.Assert.assertEquals;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;


	@Test
	public void testInsertShop() {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("test shop");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(0);
		shop.setAdvice("pending");
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1, effectedNum);
	}


	@Test

	public void testUpdateShop() {
		Shop shop = new Shop();
		shop.setShopId(84L);
		shop.setShopDesc("test desc");
		shop.setShopAddr("test address");
		shop.setLastEditTime(new Date());
		int effectedNum = shopDao.updateShop(shop);
		assertEquals(1, effectedNum);
	}
}
