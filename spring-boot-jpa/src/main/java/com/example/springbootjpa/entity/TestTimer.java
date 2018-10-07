package com.example.springbootjpa.entity;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 高展 on 2018/10/7.
 */
public class TestTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask(){

            @Override
            public void run() {
                System.out.println("task  run:"+ new Date());
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        timer.schedule(timerTask,10,3000);


//
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        // 参数：1、任务体 2、首次执行的延时时间
//        //      3、任务执行间隔 4、间隔时间单位
//        service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+new Date()), 0, 3, TimeUnit.SECONDS);
    }
}
