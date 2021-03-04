package com.ZRS.test;

import com.ZRS.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWeb {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController controller = context.getBean("controller", UserController.class);
        controller.list();
    }
}
