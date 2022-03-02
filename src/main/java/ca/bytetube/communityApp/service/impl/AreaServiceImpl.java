package ca.bytetube.communityApp.service.impl;

import ca.bytetube.communityApp.dao.AreaDao;
import ca.bytetube.communityApp.entity.Area;
import ca.bytetube.communityApp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {

		return areaDao.queryArea();
	}



}
