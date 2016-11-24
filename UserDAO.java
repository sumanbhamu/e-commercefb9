package com.suman.ecom.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.suman.ecom.model.User;


@Repository

public interface UserDAO {

	public boolean isValidate(String name, String pass);

	public boolean saveOrUpdate(User user);

	public boolean delete(User user);

	public User get(String name);

	public List<User> list();

}
