package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 高展 on 2018/9/27.
 */
@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String nickname;
    private String password;
    private Integer fans;

    public SysUser(String account, String nickname, String password, Integer fans) {
        this.account = account;
        this.nickname = nickname;
        this.password = password;
        this.fans = fans;
    }

    public SysUser() {
    }
}
