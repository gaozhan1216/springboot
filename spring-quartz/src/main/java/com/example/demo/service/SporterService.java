package com.example.demo.service;

import com.example.demo.entity.Sporter;

import java.util.List;

/**
 * Created by 高展 on 2018/10/11.
 */
public interface SporterService {
    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    Sporter login(String account, String password);


    /**
     * 查找所有用户的信息，以及该用户下的步数信息
     * @return
     */
    List<Sporter> findAll();
}
