package com.nayan.springboot.web.dao;

import java.util.List;

import com.nayan.springboot.web.model.LoginModel;

public interface LoginDao {
public int insert(LoginModel login);
public List<LoginModel> showAll();
}
