package com.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void addUser() {

        System.out.println("Adding New User");
    }


    public void deleteUser() {

        System.out.println("Removing existing User");
    }

    @Deprecated
    public void methodWIthAnnotation(){

    }

}
