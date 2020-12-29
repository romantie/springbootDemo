package nuc.edu.chapter05_mybatis1_20201118.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.chapter05_mybatis1_20201118.dao.IUserDao;
import nuc.edu.chapter05_mybatis1_20201118.param.UserParam;
import nuc.edu.chapter05_mybatis1_20201118.pojo.User;
import nuc.edu.chapter05_mybatis1_20201118.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
    private IUserDao userDao;
	
	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	@Override
	public List<User> findAllUser1(String userName, String note) {
		// TODO Auto-generated method stub
		return userDao.findAllUser1(userName, note);
	}

	@Override
	public Integer insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public Integer deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
	
}
