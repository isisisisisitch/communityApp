package ca.bytetube.communityApp.service;

import ca.bytetube.communityApp.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {

	/**
	 * 根据查询条件获取ShopCategory列表
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);



}
