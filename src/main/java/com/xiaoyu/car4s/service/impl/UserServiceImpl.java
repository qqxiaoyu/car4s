package com.xiaoyu.car4s.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyu.car4s.entity.User;
import com.xiaoyu.car4s.mapper.UserMapper;
import com.xiaoyu.car4s.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> all() {
		List<User> list = userMapper.all();
		return list;
	}

	@Override
	public User findByUsername(String username) {
		User user=userMapper.findByUsername(username);
		return user;
	}

	@Override
	public void register(User user) {
		userMapper.register(user);
		
	}

	@Override
	public User picture(User user) {
		userMapper.update(user);
		User user2 = userMapper.findByUsername(user.getUsername());
		return user2;
	}

}
