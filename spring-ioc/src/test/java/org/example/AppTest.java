package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.sql.PreparedStatement;

/**
 * Unit test for simple App.
 */
public class AppTest {
    


    @Test
    public void Test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println();
        System.out.println( ac.getBean("bean1"));
        System.out.println("-----");
//        MyResources myResources = (MyResources)ac.getBean(MyResources.class);
//        Resource resource = myResources.getResource();
//        System.out.println(resource.getFilename());
    }
}