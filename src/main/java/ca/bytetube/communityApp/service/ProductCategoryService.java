package ca.bytetube.communityApp.service;

import ca.bytetube.communityApp.entity.ProductCategory;
import java.util.List;

public interface ProductCategoryService {
	/**
	 * 查询指定某个店铺下的所有商品类别信息
	 */
	List<ProductCategory> getProductCategoryList(long shopId);


}
