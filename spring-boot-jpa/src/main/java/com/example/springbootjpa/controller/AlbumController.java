package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.servicce.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 高展 on 2018/9/29.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;
    @GetMapping("/list")
    public List<Album> getAll(){
        return albumService.getAll();
    }
    @GetMapping(value = "/{id}")
    public Album getOne(@PathVariable("id") Integer id){
        return albumService.findOne(id);
    }

}
