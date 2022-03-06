package ca.bytetube.communityApp.service.impl;
import ca.bytetube.communityApp.dao.ShopCategoryDao;
import ca.bytetube.communityApp.entity.ShopCategory;
import ca.bytetube.communityApp.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

	@Autowired
	private ShopCategoryDao shopCategoryDao;


	@Override
	public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {

		return shopCategoryDao.queryShopCategory(shopCategoryCondition);
	}







}
