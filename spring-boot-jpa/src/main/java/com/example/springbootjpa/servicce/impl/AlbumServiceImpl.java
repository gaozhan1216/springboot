package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.DAO.AlbumRespository;
import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.servicce.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 高展 on 2018/9/29.
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRespository albumRespository;
    @Override
    public List<Album> getAll() {
        return albumRespository.findAll();
    }
    @Override
    public Album findOne(Integer id) {
        return albumRespository.findById(id).get();
    }

}
