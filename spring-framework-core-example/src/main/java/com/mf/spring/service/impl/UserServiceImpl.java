package com.mf.spring.service.impl;


import com.mf.spring.pojo.User;
import com.mf.spring.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService, BeanFactoryPostProcessor {

	@Override
	public User getUserById(long id) {
		User user = new User("zp");
		return user;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory::" +  beanFactory);
	}
}
