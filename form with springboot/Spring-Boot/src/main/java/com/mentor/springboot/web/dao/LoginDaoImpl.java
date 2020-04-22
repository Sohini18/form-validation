package com.nayan.springboot.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.nayan.springboot.web.model.LoginModel;
@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insert(LoginModel login) {
		// TODO Auto-generated method stub
		
		String sql="insert into log_tab(uname,pwd) values(?,MD5(?))";
		int r=jt.update(sql,login.getUserName(),login.getPassword());
		
		
		
		return r;
	}

	@Override
	public List<LoginModel> showAll() {
		// TODO Auto-generated method stub
		String query = "select * from log_tab";
		return jt.query(query, (rs, rowNum) -> new LoginModel(rs.getString(1), rs.getString(2)));
	}

}
