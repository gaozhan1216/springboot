package com.niit.quickstart.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 高展 on 2018/9/3.
 */
@Configuration
public class Teacher {
    @Value("zhan ")
    private String name;
    @Value("2")
    private String teacherId;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getTeacherId(){
        return teacherId;
    }
    public void setTeacherId(String teacherId){
        this.teacherId=teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
