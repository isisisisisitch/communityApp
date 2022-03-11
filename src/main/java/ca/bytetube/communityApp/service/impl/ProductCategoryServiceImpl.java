package ca.bytetube.communityApp.service.impl;

import ca.bytetube.communityApp.dao.ProductCategoryDao;
import ca.bytetube.communityApp.entity.ProductCategory;
import ca.bytetube.communityApp.exceptions.ProductCategoryOperationException;
import ca.bytetube.communityApp.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Override
	public List<ProductCategory> getProductCategoryList(long shopId) {
		return productCategoryDao.queryProductCategoryList(shopId);
	}


}
