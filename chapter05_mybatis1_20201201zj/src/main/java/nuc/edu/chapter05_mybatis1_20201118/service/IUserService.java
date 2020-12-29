package nuc.edu.chapter05_mybatis1_20201118.service;

import java.util.List;

import nuc.edu.chapter05_mybatis1_20201118.param.UserParam;
import nuc.edu.chapter05_mybatis1_20201118.pojo.User;

public interface IUserService {
	public List<User> findAllUser();
	public User getUser(Integer id) ;
	public List<User> findAllUser1(String userName,String note);
	public Integer insertUser(User user);
	public Integer deleteUser(Integer id);
	public Integer updateUser(User user);
	
}
