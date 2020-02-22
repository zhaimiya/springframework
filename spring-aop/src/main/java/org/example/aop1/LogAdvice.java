package org.example.aop1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("method "+method.getName()+" args: "+ Arrays.toString(objects) + " target: " +o );
    }
}
