package com.zhiwangyilian.service.impl;

import com.zhiwangyilian.dao.TestDao;
import com.zhiwangyilian.entity.TSysUserEntity;
import com.zhiwangyilian.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liruidong on 2016/2/25.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public TSysUserEntity findOneUserInfo(String userId) {
        return testDao.getUserById(userId);
    }
}
