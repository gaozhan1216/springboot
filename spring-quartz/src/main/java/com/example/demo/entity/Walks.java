package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 高展 on 2018/10/11.
 */
    @Data
    @Entity
    public class Walks {
        @Id
        @GeneratedValue
        private Integer id;

        /**
         * 行走的步数
         */
        private Integer walkCount;

        /**
         * 创建的时间
         */
        private Date createTime;

        public Walks() {

        }

        public Walks(Integer walkCount, Date createTime) {
            this.walkCount = walkCount;
            this.createTime = createTime;
        }
    }


