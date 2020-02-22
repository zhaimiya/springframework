package org.example.aop1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogoutAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("afterReturning -----   :"+o +" method: "+method +" args: "+ Arrays.toString(objects)+" o1: "+o1);
    }
}
