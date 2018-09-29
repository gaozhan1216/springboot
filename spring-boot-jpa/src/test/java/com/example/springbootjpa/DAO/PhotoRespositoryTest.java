package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Photo;
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
public class PhotoRespositoryTest {
    @Resource
    private PhotoRespository photoRespository;

    @Test
    public void initData(){
        Photo[] photos = {
                new Photo("https://goo.gl/BDDpoY","https://goo.gl/BDDpoY"),
                new Photo("https://goo.gl/vJtTNd","https://goo.gl/vJtTNd"),
                new Photo("https://goo.gl/hKCVE5","https://goo.gl/hKCVE5"),
                new Photo("https://goo.gl/Xsa7Sq","https://goo.gl/Xsa7Sq"),
                new Photo("https://goo.gl/7QAxDA","https://goo.gl/7QAxDA"),
                new Photo("https://goo.gl/wwaJE4","https://goo.gl/wwaJE4"),
                new Photo("https://goo.gl/AtvjbD","https://goo.gl/AtvjbD"),
                new Photo("https://goo.gl/MH7jFM","https://goo.gl/MH7jFM")
        };
        for(int i=0;i<photos.length;i++){
            photoRespository.save(photos[i]);
        }
    }

}