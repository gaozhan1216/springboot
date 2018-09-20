package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.entity.Student;
import com.example.springbootjpa.servicce.BookService;
import com.example.springbootjpa.servicce.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest

public class StudentServiceImplTest {
    @Resource
    private StudentService studentService ;

    @Test
    public void save(){
        String[] names = {"AA","BB","CC","DD","EE"} ;
        Random random = new Random() ;
        for (int i = 0 ; i < 5; i ++ ){
            Student student = new Student();
            student.setStuName(names[i]);
            student.setStuAge(random.nextInt(30));
            System.out.println(studentService.save(student));
        }
    }

    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}
