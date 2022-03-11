package ca.bytetube.communityApp.dao;

import ca.bytetube.communityApp.entity.ProductCategory;
import java.util.List;

public interface ProductCategoryDao {
	/**
	 * 通过shop id 查询店铺商品类别
	 */
	List<ProductCategory> queryProductCategoryList(long shopId);


}
