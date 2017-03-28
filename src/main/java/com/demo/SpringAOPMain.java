package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class SpringAOPMain {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser();
        userService.deleteUser();
        userService.getUser();
        userService.methodWIthAnnotation();
        userService.methodWithException();
    }
}
