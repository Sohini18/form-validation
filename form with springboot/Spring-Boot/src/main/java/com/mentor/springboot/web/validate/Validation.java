package com.nayan.springboot.web.validate;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.nayan.springboot.web.model.LoginModel;
@Component

public class Validation implements Validator {

	public void validate(Object arg0, Errors arg1) {
		
		LoginModel reg=(LoginModel)arg0;
		if(reg.getUserName().equals("")) {
            arg1.rejectValue("userName","","User Name cannot be blank");
            }
		if(reg.getPassword().equals("")) {
            arg1.rejectValue("password","","Password cannot be blank");}

		String m="^(?=.*[0-9]).{8,15}$";
		if(reg.getPassword().matches(m)==false) {
			arg1.rejectValue("password","","Invalid Format");
		}
		
		
		
		
	
	
	
	
	
	}
	


	public boolean supports(Class<?> arg0) {
		return LoginModel.class.isAssignableFrom(arg0);
		
		
		
		
	}


	@Override
	public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value,
			Class<?>... groups) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T unwrap(Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ExecutableValidator forExecutables() {
		// TODO Auto-generated method stub
		return null;
	}



}
