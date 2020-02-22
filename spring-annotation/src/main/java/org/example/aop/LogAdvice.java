package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    @Pointcut("execution(String org.example.*.impl.*.*(..))")
    private void pointCut(){
        System.out.println("pointCut()");
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println();
        System.out.println("Aspect-before --");
        System.out.println();
    }

    @AfterReturning(pointcut = "pointCut()",returning="returnVal")
    public void after(JoinPoint joinPoint, String returnVal){
        System.out.println();
        System.out.println("Aspect-after");
    }

    @AfterThrowing(pointcut = "pointCut()",throwing = "e")
    public void throwing(JoinPoint joinPoint, Exception e) {
        System.out.println();
        System.out.println("Aspect-throwing");
        System.out.println(joinPoint.getSignature().getName() + " Exception e： " + e);
        System.out.println();
    }

    @Around(("pointCut()"))
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println();
        System.out.println("Aspect-around before---");
        Object val = null;
        try {
            val = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("catch");
            throwable.printStackTrace();
        }
        System.out.println("Aspect-around after---");
        System.out.println();
        return val;
    }

}
