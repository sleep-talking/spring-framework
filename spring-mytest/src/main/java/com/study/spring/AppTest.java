package com.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Khuqic
 * @version 1.0
 * @date 2022/2/27 13:11
 * @description
 */
public class AppTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        System.err.println(context);
        User user = context.getBean("getUserInstance", User.class);
        System.err.println(user);
    }
}
