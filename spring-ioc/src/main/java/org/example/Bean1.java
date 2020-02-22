package org.example;

public class Bean1 {
    private  User user;
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "user=" + user +
                ", tag='" + tag + '\'' +
                '}';
    }
}
