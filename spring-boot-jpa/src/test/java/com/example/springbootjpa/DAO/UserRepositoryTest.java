package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 高展 on 2018/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;
    @Test
    public void initData(){
        SysUser[] users={
                new SysUser("aaafda@qq.com","知乎","114431",1045),
                new SysUser("bbdfdsb@qq.com","慕课","225342",230),
                new SysUser("cccvfdc@qq.com","智学","333533",980),
                new SysUser("ddddvdf@qq.com","豆瓣","443534",4040),
                new SysUser("eeedsfs@qq.com","简书","55234235",270)
        };
        for (int i = 0; i<users.length;i++){
            userRepository.save(users[i]);
        }
    }
    @Test
    public void findByAccount(){
        SysUser sysUser=userRepository.findByAccount("ccc@qq.com");
        System.out.println(sysUser);
    }
    @Test
    public void findByNicknameStartingWith(){
        List<SysUser> users=userRepository.findByNicknameStartingWith("简书大学堂");
        users.forEach(sysUser -> System.out.println(users));
    }
    @Test
    public void findByNicknameStartingWithAndFansAfter(){
        List<SysUser> users=userRepository.findByNicknameStartingWithAndFansAfter("简",10);
        users.forEach(sysUser -> System.out.println(users));
    }
    @Test
    public void findAll(){
        List<SysUser> users=userRepository.findAll();
        users.forEach(sysUser -> System.out.println(sysUser));
    }



//    @Test
//    public void findByNickNameContains(){
//        List<SysUser> users=userRepository.findByNickNameContains("简书大学堂");
//        users.forEach(sysUser -> System.out.println(users));
//    }

}