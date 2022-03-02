package ca.bytetube.communityApp.dao;



import ca.bytetube.communityApp.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AreaDao {
	/**
	 *
	 * @return areaList
	 */
	List<Area> queryArea();


}
