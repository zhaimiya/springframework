package org.example.aop2;


import java.util.Date;

public class UserSrvImpl implements UserSrv {
    @Override
    public String login(String usrNm,String pwd) {
        return usrNm +"login success at "+ new Date().getTime();
    }

    @Override
    public String logout() {
        return "logout() - now one leave------ ";
    }

    @Override
    public String hello(){
        System.out.println("hello() __");
        return  "hello() !";
    }

    public static String hello(String s){
        System.out.println("hello(String s) __");
        return  "hello(String s) !";
    }
}
