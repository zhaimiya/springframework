package com.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanHolder implements ApplicationContextAware {
  private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac = applicationContext;
    }


    public  static  Object getBean(String name){
       return ac.getBean(name);
    }

    public  static  Object getBean(Class clazz){
        return ac.getBean(clazz);
    }
}
