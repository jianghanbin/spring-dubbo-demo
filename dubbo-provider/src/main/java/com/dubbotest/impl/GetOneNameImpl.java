package com.dubbotest.impl;

import com.dubbotest.IGetOneName;

/**
 * Created by jiang on 2017/12/14 0014.
 */
public class GetOneNameImpl implements IGetOneName {
    public String PrintName(String name) {
        System.out.println("我是GetOneName接口实现:"+name);
        return name;
    }
}
