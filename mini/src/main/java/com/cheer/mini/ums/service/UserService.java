package com.cheer.mini.ums.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.ums.dto.request.CustomerUserCreateRequest;
import com.cheer.mini.ums.dto.request.registerRequest;
import com.cheer.mini.ums.model.User;

/**
 * 站在使用者的角度去设计接口
 * 
 * @author Lucy
 * 
 */
public interface UserService {

	public User getByAccount(String account);

	public User adminLogin(String account, String password)
			throws ServiceException;

	public int createUser(CustomerUserCreateRequest userParam)
			throws ServiceException;

	public List<User> listUser();

	public User insertUser(User user);

	public User insertcreatUser(User user) throws ServiceException;

}
