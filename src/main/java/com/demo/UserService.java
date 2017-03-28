package com.demo;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService {

    public void addUser() {

        System.out.println("Adding New User");
    }


    public void deleteUser() {

        System.out.println("Removing existing User");
    }


    public User getUser() {
        System.out.println("Removing existing User");
        return new User("A", "B");
    }

    @Deprecated
    public void methodWIthAnnotation() {

    }


    public void methodWithException() {

        // After Throwing advice wont be called in this case
        try {

            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
