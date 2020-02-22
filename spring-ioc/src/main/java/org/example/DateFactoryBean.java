package org.example;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;
import java.util.Date;

public class DateFactoryBean implements FactoryBean<Date> {
    private  Integer year;
    private  Integer month;
    private  Integer day;


    public DateFactoryBean() {
        System.out.println("DateFactoryBean()");
    }

    @Override
    public String toString() {
        System.out.println("toString");
        return "DateFactoryBean{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public Date getObject() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        return calendar.getTime();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
