package org.example;

import org.example.aop2.UserSrv;
import org.example.aop2.UserSrvImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class Aop2Test {



    @Test
    public void testSpring2X(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");

        UserSrv userSrv = (UserSrv)ac.getBean("userSrv");

        System.out.println(userSrv.getClass());

        System.out.println(userSrv.login("XXXX","1234"));;

        System.out.println("-------------------------");

        System.out.println(userSrv.logout());

        System.out.println();
        System.out.println("------");
        userSrv.hello();

        System.out.println();
        UserSrvImpl.hello("xix");
    }

    @Test
    public void testA(){
        System.out.println("--------- -------------  ");
    }
}
