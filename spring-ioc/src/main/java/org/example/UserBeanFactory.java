package org.example;

public class UserBeanFactory {
    public  User getUserBean(){
        return new User();
    }

    public  User getUserBean(String nm,String gender){
        System.out.println(" getUserBean(String nm,String gender)");
        User user =  new User();
        user.setGender(gender);
        user.setName(nm);
        return user;
    }
}
