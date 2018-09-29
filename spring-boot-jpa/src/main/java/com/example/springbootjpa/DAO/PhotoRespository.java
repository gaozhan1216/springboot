package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 高展 on 2018/9/29.
 */
public interface PhotoRespository extends JpaRepository<Photo,Integer> {

}
