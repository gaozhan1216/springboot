package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 高展 on 2018/9/29.
 */
public interface AlbumRespository extends JpaRepository<Album,Integer> {
    @Query("FROM Album a ORDER BY a.likes DESC")
    List<Album> findHotAlbums();

}
