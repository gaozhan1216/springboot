package com.example.demo.quartz;

import com.example.demo.service.WalksService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by 高展 on 2018/10/11.
 */
@Component
public class SporterJob {
    @Resource
    private WalksService walksService;

    @Scheduled(cron = "0 10 16 * * ? ")
    public void updateTodayWalks() throws Exception {
        walksService.updateWalks();
    }
}
