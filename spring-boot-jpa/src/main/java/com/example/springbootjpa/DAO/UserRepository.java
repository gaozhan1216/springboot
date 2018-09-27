package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 高展 on 2018/9/27.
 */
public interface UserRepository extends JpaRepository<SysUser,Long> {
    /**
     * 根据账号精确查询
     * @param account
     * @return
     */
    SysUser findByAccount(String account);


    /**
     * 根据昵称模糊查询
     * @param nickname
     * @return
     */
    List<SysUser> findByNicknameStartingWith(String nickname);


    /**
     * 根据昵称模糊查询和粉丝数查询
     * @param nickname
     * @param fans
     * @return
     */
    List<SysUser> findByNicknameStartingWithAndFansAfter(String nickname, Integer fans);


    List<SysUser> findByPasswordLessThan(Integer length);

    @Query("from SysUser u where u.nickname=:nickname")
    SysUser findUser(@Param("nickname") String nickname);


    @Query("from SysUser u where u.nickname like  %:nickname% order by u.fans desc")
    List<SysUser> findUsers(@Param("nickname") String nickname);

    List<SysUser> findByNicknameLike(String keywords);
}
