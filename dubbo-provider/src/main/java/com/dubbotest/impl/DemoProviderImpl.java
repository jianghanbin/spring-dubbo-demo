package com.dubbotest.impl;

import com.dubbotest.IDemoProvider;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class DemoProviderImpl implements IDemoProvider {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
