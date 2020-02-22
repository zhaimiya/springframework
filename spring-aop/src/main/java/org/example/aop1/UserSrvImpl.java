package org.example.aop1;


import java.util.Date;

public class UserSrvImpl implements UserSrv{
    @Override
    public String login(String usrNm,String pwd) {
        return usrNm +"login success at "+ new Date().getTime();
    }

    @Override
    public String logout() {


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "now one leave------ ";
    }
}
