package org.example;

import static org.junit.Assert.assertTrue;

import net.sf.cglib.proxy.Enhancer;
import org.example.aop1.App;
import org.example.aop1.UserSrv;
import org.example.aop1.UserSrvImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        UserSrv userSrv = (UserSrv) Proxy.newProxyInstance(
                UserSrvImpl.class.getClassLoader(),//目标类的类加载器
                new Class[]{UserSrv.class},//目标类的接口列表
                new InvocationHandler() {//交叉业务逻辑
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 打印日志
                        System.out.println(method.getName() + " 打印日志 ---" );
                        //执行业务逻辑
                       Object o =  method.invoke(new UserSrvImpl(),args);
                        System.out.println(o);
                        System.out.println();
                        return o;
                    }
                });

        userSrv.login("XIXI","0000");
        System.out.println(" ---------- ---------- --------");
        userSrv.logout();
        System.out.println(userSrv.getClass());
    }
    @Test
    public void testCglib(){
        App app = (App) Enhancer.create(
                App.class,
                new net.sf.cglib.proxy.InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println(method.getName() + " start  ---- ");
                        return method.invoke(new App(),objects);
                    }
                }
        );

        app.HelloWord(new String[]{"XIXI"});

        //代理类的类型
        System.out.println(app.getClass());
    }


    @Test
    public void testSpring1X(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        UserSrv userSrv = (UserSrv)ac.getBean("userSrv");

        System.out.println(userSrv.getClass());

        System.out.println(userSrv.login("XXXX","1234"));;

        System.out.println("-------------------------");

        System.out.println(userSrv.logout());
    }

    @Test
    public void testA(){
        System.out.println("--------- -------------  ");
    }
}
