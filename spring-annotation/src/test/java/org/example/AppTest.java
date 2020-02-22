package org.example;

import org.example.srv.UserSrv;
import org.example.srv.impl.UserSrvImpl;
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

        UserSrv userSrv = (UserSrv)ac.getBean("userSrvImpl");
        userSrv.login("XXii","1234");

        System.out.println();

        System.out.println("--- ---");


    }
}
