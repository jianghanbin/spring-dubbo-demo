package com.dubbotest.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class AppApplication {

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-provider.xml");
            System.out.println();
            context.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            while (true) {
                Thread.sleep(Long.MAX_VALUE);
            }
        }catch (InterruptedException e){

        }
    }
}
