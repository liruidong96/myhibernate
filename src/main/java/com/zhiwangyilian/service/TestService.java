package com.zhiwangyilian.service;

import com.zhiwangyilian.entity.TSysUserEntity;

/**
 * Created by liruidong on 2016/2/25.
 */
public interface TestService {
    TSysUserEntity findOneUserInfo(String userId);
}
