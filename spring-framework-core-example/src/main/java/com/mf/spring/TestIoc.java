package com.mf.spring;


import com.mf.spring.config.AppConfig;
import com.mf.spring.pojo.User;
import com.mf.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIoc {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean("userServiceImpl2", UserService.class);
		User user = userService.getUserById(1);
		System.out.println(user);
	}
}
