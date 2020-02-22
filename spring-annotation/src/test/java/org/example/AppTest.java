package org.example;

import org.example.dao.impl.UserDaoImpl;
import org.example.ioc.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println(ac.getBean("SpringBean").equals(ac.getBean("SpringBean")));
//        System.out.println("--- ok ---");
//        System.out.println(ac.getBean(UserDaoImpl.class));

        System.out.println("--- ---");


    }
}
