package com.nayan.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayan.springboot.web.dao.LoginDao;
import com.nayan.springboot.web.model.LoginModel;
@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private LoginDao loginDao;
	
	
	@Override
	public int insert(LoginModel login) {
		// TODO Auto-generated method stub
		return loginDao.insert(login);
	}

	@Override
	public List<LoginModel> showAll() {
		// TODO Auto-generated method stub
		return loginDao.showAll();
	}

}
