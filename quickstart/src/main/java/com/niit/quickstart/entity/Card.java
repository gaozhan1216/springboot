package com.niit.quickstart.entity;

import lombok.Data;

/**
 * Created by 高展 on 2018/9/10.
 */
@Data
public class Card {
    private String imgLink;
    private String title;

    public Card(){
    }
    public Card(String imgLink,String title){
        this.imgLink=imgLink;
        this.title=title;
    }
}
