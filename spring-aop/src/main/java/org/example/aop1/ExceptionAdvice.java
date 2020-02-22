package org.example.aop1;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("Exception");
    }

    public void afterThrowing(NullPointerException e){
        System.out.println("NullPointerException");
    }

    public void afterThrowing(ArithmeticException e){
        System.out.println("ArithmeticException");
    }

}
