package com.example.demo.dao;

import com.example.demo.entity.Sporter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 高展 on 2018/10/11.
 */
public interface SporterRepository extends JpaRepository<Sporter,String> {
    /**
     * 根据账号密码来查找个人信息
     * @param account
     * @param password
     * @return
     */
    Sporter findByAccountAndPassword(String account, String password);
}
