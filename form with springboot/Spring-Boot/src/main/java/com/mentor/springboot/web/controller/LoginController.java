package com.nayan.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nayan.springboot.web.dao.LoginDao;
import com.nayan.springboot.web.model.LoginModel;
import com.nayan.springboot.web.service.LoginService;
import com.nayan.springboot.web.validate.Validation;
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
	
	@Autowired
	private Validation l;
	@RequestMapping(value="/", method=RequestMethod.GET)
	
	public String showLogin(@ModelAttribute("register")LoginModel loginModel,BindingResult result) {

	return "login";
	                           }
@RequestMapping(value="/", method=RequestMethod.POST)
	
	public String showWelcome(@ModelAttribute("register")LoginModel loginModel,BindingResult result,@RequestParam("userName")String userName,ModelMap model) {
	l.validate(loginModel,result);
	model.put("userName",userName);
	LoginModel lo=new LoginModel(loginModel.getUserName(),loginModel.getPassword());
	   loginService.insert(lo);
	   if (result.hasErrors()) {
		   
           return "login";
           }
           return "Wekcome";
	
	
                                         }
}
