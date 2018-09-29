package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.Album;

import java.util.List;

/**
 * Created by 高展 on 2018/9/29.
 */
public interface AlbumService {
    List<Album> getAll();

    Album findOne(Integer id);

}
