package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 高展 on 2018/9/29.
 * 相册类
 */
@Data
@Entity
public class Album implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    private String albumCover;
    private String albumTitle;
    private String albumDescription;
    private Integer likes;

    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "album_id")
    private List<Photo> photos = new ArrayList<>();

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }

    public Album() {
    }
}
