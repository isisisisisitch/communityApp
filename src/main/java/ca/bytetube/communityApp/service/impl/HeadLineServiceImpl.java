package ca.bytetube.communityApp.service.impl;

import ca.bytetube.communityApp.dao.HeadLineDao;
import ca.bytetube.communityApp.entity.HeadLine;
import ca.bytetube.communityApp.service.HeadLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class HeadLineServiceImpl implements HeadLineService {
    @Autowired
    private HeadLineDao headLineDao;


    @Override
    @Transactional
    public List<HeadLine> getHeadLineList(HeadLine headLineCondition) {
        return headLineDao.queryHeadLine(headLineCondition);
    }


}
