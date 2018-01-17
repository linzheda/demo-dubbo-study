package com.yc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.biz.DemoBiz;


public class MyTest {
	
	public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        //System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springmvc.xml"});
        context.start();
        DemoBiz demoService = (DemoBiz) context.getBean("demoBiz"); // get remote service proxy

        while (true) {
            try {
                Thread.sleep(10000);
                String hello = demoService.getDemo(); // call remote method
                System.out.println(hello); // get result

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }

    }
}
