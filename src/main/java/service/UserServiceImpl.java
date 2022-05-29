package service;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.UserPojo;

public class UserServiceImpl implements UserService {
	
	UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public UserPojo loginUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		return userDao.loginUser(userPojo);
	}

}
