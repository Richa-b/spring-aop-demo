package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

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
    public void logBeforeAnnotatedMethods(JoinPoint joinPoint) {
        System.out.println("logBeforeAnnotatedMethods() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @Pointcut("@annotation(java.lang.Deprecated)")
    private void annotatedWithAnnotation() {

    }

    @AfterReturning(value = "execution(* *.getUser())", returning = "returnedValue")
    public void logAfterReturning(JoinPoint joinPoint, User returnedValue) {
        System.out.println("In After Returning Advice");
        System.out.println("returned Value::" + returnedValue);

    }


}