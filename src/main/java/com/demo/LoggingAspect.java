package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.demo.UserService.addUser(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @After("execution(* del*(..)) || annotatedWithAnnotation()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }


    @Before("annotatedWithAnnotation()")
    public void logBeforeAnnotatedMethods(JoinPoint joinPoint){
        System.out.println("logBeforeAnnotatedMethods() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @Pointcut("@annotation(java.lang.Deprecated)")
    private void annotatedWithAnnotation(){

    }





}