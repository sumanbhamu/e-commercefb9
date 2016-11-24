package com.suman.ecom.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suman.ecom.model.User;

@Repository(value = "userDAO")
// @EnableTransactionManagement

public class UserDAOImpl implements UserDAO {

	@Autowired
	User user;

	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean isValidate(String name, String pass) {

		if (name.equals("sa") && pass.equals("sa")) {
			return true;
		} else {
			return false;
		}
	}

	@Transactional

	public boolean saveOrUpdate(User user) {
		try {

			Session s = sessionFactory.getCurrentSession();
			Transaction t = s.beginTransaction();
			s.saveOrUpdate(user);
			t.commit();
			// sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User get(String name) {
		System.out.println("inside get method");
		Session s = sessionFactory.getCurrentSession();
		Transaction t = s.beginTransaction();
		// emailid col in tab .name is string
		String str = "From User where emailid='" + name + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(str);
		List<User> ulist = query.list();

		if ((ulist != null) && ulist.isEmpty()) {
			System.out.println("fetch from user");
			t.commit();

		}

		return ulist.get(0);
	}

}
