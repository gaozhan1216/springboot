package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.servicce.AlbumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by 高展 on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceTest {
    @Resource
    private AlbumService albumService;
    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void findOne() throws Exception {
        Album album = albumService.findOne(43);
        System.out.println(album);

    }

}