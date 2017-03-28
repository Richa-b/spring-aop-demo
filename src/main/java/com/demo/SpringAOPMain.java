package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser();
        userService.deleteUser();
        userService.methodWIthAnnotation();
    }
}
