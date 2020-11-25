package com.lmk.springdemo.dao;

import com.lmk.springdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LUserDao {

    public User getUser(Integer id);
    public List<User> findAllUser();
    public List<User> findUser(
          @Param("userName") String userName,
          @Param("note") String note
    );
    public Integer insertUser(User user);
    public Integer deleteUser(Integer id);

}
