package com.niit.quickstart.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 高展 on 2018/9/10.
 */
@Data
@Configuration
public class Shao {
    private String avator;
    private String writer;
    private String pic;
    private String title;
    private String content;
    private String mpic;
    private String mtitle;
    private String mcontent;
    private String time;

}
