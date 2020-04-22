package com.nayan.springboot.web.service;

import java.util.List;

import com.nayan.springboot.web.model.LoginModel;

public interface LoginService {
	public int insert(LoginModel login);
	public List<LoginModel> showAll();
}
