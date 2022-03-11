package ca.bytetube.communityApp.dao;

import ca.bytetube.communityApp.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {

	Shop queryByShopId(long shopId);

	int insertShop(Shop shop);

	int updateShop(Shop shop);

}
