package ca.bytetube.community.service;

import ca.bytetube.community.BaseTest;
import ca.bytetube.communityApp.entity.Area;
import ca.bytetube.communityApp.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;

	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		System.out.println(areaList.get(0).getAreaName());
		assertEquals("montreal", areaList.get(0).getAreaName());

	}
}
