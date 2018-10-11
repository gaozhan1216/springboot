package com.example.demo.service.impl;

import com.example.demo.dao.WalksRepository;
import com.example.demo.entity.Walks;
import com.example.demo.service.WalksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by 高展 on 2018/10/11.
 */
@Service
public class WalksServiceImpl implements WalksService{
    @Resource
    private WalksRepository walksRepository;

    /**
     * 更新数据
     */
    @Override
    public void updateWalks() {
        List<Walks> list = walksRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Walks walks = list.get(i);
            walks.setWalkCount(random.nextInt(20000)+20000);
            walks.setCreateTime(new Date());
            walksRepository.saveAndFlush(walks);
        }
    }
}
