package org.example.aop1;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TimeAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        Object[] args = methodInvocation.getArguments();
        Object target = methodInvocation.getThis();

        System.out.println();
        long start = System.currentTimeMillis();
        System.out.println("TimeAdvice-pre: method " + method + " args " + Arrays.toString(args) + " target " + target);
        Object val = methodInvocation.proceed(); // 执行业务逻辑，其实就是调用业务逻辑，返回值表示执行业务方法返回的结果
        System.out.println("TimeAdvice-post:method " + method);
        long count = System.currentTimeMillis()-start;
        System.out.println("耗时： "+ count);
        System.out.println();
        return val;
    }
}
