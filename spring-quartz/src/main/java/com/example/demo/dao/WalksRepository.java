package com.example.demo.dao;

import com.example.demo.entity.Walks;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 高展 on 2018/10/11.
 */
public interface WalksRepository extends JpaRepository<Walks,Integer> {
}
