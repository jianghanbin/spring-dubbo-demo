package com.dubbotest;

import com.dubbotest.IDemoProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class LuncherConsumer {
    public static void main(String[] args) throws InterruptedException {
        LuncherConsumer luncher = new LuncherConsumer();
        luncher.start();
    }

    void start() {
        String configLocation = "spring-dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        IDemoProvider ds = (IDemoProvider) context.getBean("demoProvider");
        IGetOneName getOneName = (IGetOneName) context.getBean("getOneName");
        String[] names = context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for (String string : names) {
            System.out.print(string);
            System.out.println(",");
        }
        System.out.println(ds.sayHello("test"));
        System.out.println(getOneName.PrintName("GetNoeName"));


    }
}
