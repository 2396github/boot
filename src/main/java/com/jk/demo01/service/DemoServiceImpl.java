package com.jk.demo01.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public String getdemo(Integer id){
        return "ID"+id;
    }
}
