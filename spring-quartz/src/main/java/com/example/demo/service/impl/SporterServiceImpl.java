package com.example.demo.service.impl;

import com.example.demo.dao.SporterRepository;
import com.example.demo.entity.Sporter;
import com.example.demo.service.SporterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 高展 on 2018/10/11.
 */
@Service
public class SporterServiceImpl implements SporterService {
    @Resource
    private SporterRepository sporterRepository;

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    @Override
    public Sporter login(String account, String password) {
        return sporterRepository.findByAccountAndPassword(account,password);
    }


    /**
     * 查找所有的用户
     * @return
     */
    @Override
    public List<Sporter> findAll() {
        return sporterRepository.findAll();
    }

}
