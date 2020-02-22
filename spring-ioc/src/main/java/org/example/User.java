package org.example;

public class User {
    private String name;
    private String gender;

    {
        System.out.println("User - 代码块");
    }

    public User() {
        System.out.println("constructor User() " + name + gender);
    }

    public User(String name1, String gender1) {
        System.out.println("constructor User(String,String) " + name1 + gender1);
        this.name = name1;
        this.gender = gender1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName " + this.name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        System.out.println("user toString");
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
