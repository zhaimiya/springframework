package org.example.aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogAdvice {
    /**
     * 前置增强
     * @param joinPoint
     */
    public void preAdvice(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature(); //签名
        String methodName = signature.getName(); //方法名
        MethodSignature methodSignature = (MethodSignature)signature; // 转换为方法签名
        Method method = methodSignature.getMethod();
        Object[] args = joinPoint.getArgs(); //方法参数
        Object target = joinPoint.getThis(); // 目标对象
        Object target1 = joinPoint.getTarget();

        System.out.println();

        System.out.println("signature: "+signature);
        System.out.println("methodName: "+methodName);
        System.out.println("method: "+method);
        System.out.println("args: "+ Arrays.toString(args));
        System.out.println("target: "+target);
        System.out.println("target1: "+target1);

        System.out.println();
        System.out.println();
    }

    /**
     * 后置通知
     * @param joinPoint
     * @param val
     */
    public void postAdvice(JoinPoint joinPoint,Object val){
        System.out.println("postAdvice----------- val："+val);

    }

    /**
     * 异常通知
     * @param joinPoint
     * @param e
     */
    public void exceptionAdvice(JoinPoint joinPoint,Exception e){
        System.out.println("exceptionAdvice ----- e: "+e);
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     */
    public Object processAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("processAdvice pre __");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("processAdvice post __");
        return o;
    }
}
