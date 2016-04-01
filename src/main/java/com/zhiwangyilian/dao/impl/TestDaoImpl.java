package com.zhiwangyilian.dao.impl;

import com.zhiwangyilian.dao.TestDao;
import com.zhiwangyilian.entity.TSysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by liruidong on 2016/2/25.
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


    public TSysUserEntity getUserById(String userId) {
        TSysUserEntity userEntity = hibernateTemplate.get(TSysUserEntity.class,Integer.parseInt(userId));
        return userEntity;
    }
}
