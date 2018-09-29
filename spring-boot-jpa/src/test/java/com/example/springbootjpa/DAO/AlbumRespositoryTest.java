package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Album;
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
public class AlbumRespositoryTest {
    @Resource
    private AlbumRespository albumRespository;
    @Test
    public void initData(){
        Album[] albums = {
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/09/09/ChMkJluIoTyIXX2eAB3KJaynnIgAArW1QGZwaQAHco9007.jpg","七丹彩霞","风景",12),
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/03/02/ChMkJ1snEmSIOxuyACDtz-3LcyoAApHBQNTWKcAIO3n284.jpg","清新薄荷","花",23),
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/0A/0B/ChMkJ1tEfAKIeyCwAF6u9pbKmU0AAplXQBdHUIAXq8O746.jpg","面朝大海","大海",45),
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/03/04/ChMkJ1oJW4iIIAZJAAfcOXA1PHcAAiH8gHsUiYAB9xR139.jpg","冬日之晨","冬日",56),
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/05/0F/ChMkJ1erCYqIQptxAAPESMfBQZoAAUU6QB4oVwAA8Rg091.jpg","热带海岛","热带",45),
                new Album("https://desk-fd.zol-img.com.cn/t_s208x130c5/g5/M00/01/06/ChMkJlfNSYqIZ-59AAZIyweGK6EAAVCygBF398ABkjj854.jpg","护眼壁纸","护眼",34)
        };
        for (int i = 0; i<albums.length;i++){
            albumRespository.save(albums[i]);
        }
    }
    @Test
    public void findHotAlbums() throws Exception {

    }

}