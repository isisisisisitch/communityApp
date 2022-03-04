package ca.bytetube.community.service;

import ca.bytetube.community.BaseTest;
import ca.bytetube.communityApp.service.ShopService;
import ca.bytetube.communityApp.dto.ImageHolder;
import ca.bytetube.communityApp.dto.ShopExecution;
import ca.bytetube.communityApp.entity.Area;
import ca.bytetube.communityApp.entity.PersonInfo;
import ca.bytetube.communityApp.entity.Shop;
import ca.bytetube.communityApp.entity.ShopCategory;
import ca.bytetube.communityApp.enums.ShopStateEnum;
import ca.bytetube.communityApp.exceptions.ShopOperationException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;

	@Test
	public void testAddShop() throws ShopOperationException, FileNotFoundException {
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
		shop.setShopName("test add shop ");
		shop.setShopDesc("test add shop desc");
		shop.setShopAddr("test add shop addr");
		shop.setPhone("test3");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("pending");
		File shopImg = new File("/Users/dalluo/Desktop/image/logo.jpg");
		InputStream is = new FileInputStream(shopImg);
		ImageHolder imageHolder = new ImageHolder(shopImg.getName(), is);
		ShopExecution se = shopService.addShop(shop, imageHolder );
		assertEquals(ShopStateEnum.CHECK.getState(), se.getState());
	}

}
