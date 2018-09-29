package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 高展 on 2018/9/29.
 */
@Entity
@Data
public class Photo {
    @Id
    @GeneratedValue
    private Integer id;
    private String photoName;
    private String photoAddress;

    public Photo(String photoName, String photoAddress) {
        this.photoName = photoName;
        this.photoAddress = photoAddress;
    }

    public Photo() {
    }
}
