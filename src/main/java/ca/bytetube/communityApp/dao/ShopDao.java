package ca.bytetube.communityApp.dao;

import ca.bytetube.communityApp.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {


	int insertShop(Shop shop);

	int updateShop(Shop shop);

}
