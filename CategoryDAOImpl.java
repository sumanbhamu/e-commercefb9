package com.suman.ecom.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suman.ecom.model.Category;

@Repository("categoryDAO")
// @EnableTransactionManagement

public class CategoryDAOImpl implements CategoryDAO {

	/* @Autowired */
	SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;

	}

	public boolean delete(Category category) {
		return false;
	}

	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional

	public boolean save(Category category) {
		try {

			/*
			 * Session s = sessionFactory.getCurrentSession(); Transaction t =
			 * s.beginTransaction(); s.saveOrUpdate(category); t.commit();
			 */
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}