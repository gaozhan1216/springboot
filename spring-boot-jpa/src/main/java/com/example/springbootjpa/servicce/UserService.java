package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.SysUser;

import java.util.List;

/**
 * Created by 高展 on 2018/9/27.
 */
public interface UserService {
    List<SysUser> getAll();

    SysUser getUser(Long id);

    SysUser getUserByAccount(String account);

    List<SysUser> getUsersByNicknameLike(String keywords);

    List<SysUser> getUsersOrderByFans(String nickname);
}
