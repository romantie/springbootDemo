package com.ma.springbootmybatis.sevice;

import com.ma.springbootmybatis.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 查询通过id
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 添加
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 删除通过id
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 修改通过id
     * @param user
     * @return
     */
    int updateUser(User user);
}
