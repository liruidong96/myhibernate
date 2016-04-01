package com.zhiwangyilian.controller;

import com.zhiwangyilian.entity.TSysUserEntity;
import com.zhiwangyilian.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liruidong on 2016/2/25.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = {"findOneUserInfo"},method = RequestMethod.GET)
    public TSysUserEntity findOneUserInfo(String userId){
        TSysUserEntity user = testService.findOneUserInfo(userId);
        return user;
    }
}
