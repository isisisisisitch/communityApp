package ca.bytetube.community.dao;

import ca.bytetube.community.BaseTest;
import ca.bytetube.communityApp.dao.ProductCategoryDao;
import ca.bytetube.communityApp.entity.ProductCategory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductCategoryDaoTest extends BaseTest {
	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Test
	public void testBQueryByShopId() throws Exception {
		long shopId = 1;
		List<ProductCategory> productCategoryList = productCategoryDao.queryProductCategoryList(shopId);
		System.out.println("product Categories in this shop：" + productCategoryList.size());
	}

	
}
