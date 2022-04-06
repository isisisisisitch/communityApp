package ca.bytetube.community.service;

import ca.bytetube.community.BaseTest;
import ca.bytetube.communityApp.entity.Area;
import ca.bytetube.communityApp.service.AreaService;
import ca.bytetube.communityApp.service.CacheService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		System.out.println(areaList.get(0).getAreaName());
		assertEquals("montreal", areaList.get(0).getAreaName());
		cacheService.removeFromCache(areaService.AREALISTKEY);
		areaList = areaService.getAreaList();
	}
}
