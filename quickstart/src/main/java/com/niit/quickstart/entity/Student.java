package com.niit.quickstart.entity;

import lombok.*;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 高展 on 2018/9/6.
 *
 * 如果没有添加@Setter注解，则无法使用setAge（）等方法
 * 使用lombok之后，省去了许多没必要的get，set，toString，equals，hashCode代码，简化了代码
 * 住：@Data注解的作用相当于@Getter@Set特人@RequiredArgsConstructor@ToString@EqualsAndHashCode的合集
 * 住：@LOg省去了在lombokTest中添加getLogger的如下代码
 * private static final java.util.logging.Logger log=java .util.logging.logger.getLogger(logExamle.class.getName());
 */

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Configuration
@Data
public class Student {
    private String name;
    private int age;
    private String male;
    private String studentNo;



}
