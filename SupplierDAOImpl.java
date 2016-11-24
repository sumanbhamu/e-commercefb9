package com.suman.ecom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suman.ecom.model.Supplier;

@Repository(value = "supplierDAO")
// @EnableTransactionManagement
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;

	}

	public boolean delete(Supplier supplier) {
		return false;
	}

	public Supplier get(int id) {
		return null;
	}

	public List<Supplier> list() {
		return null;
	}

	@Transactional

	public boolean savOrUpdate(Supplier supplier) {
		try {

			Session s = sessionFactory.getCurrentSession();
			Transaction t = s.beginTransaction();
			s.saveOrUpdate(supplier);
			t.commit();

			// sessionFactory.getCurrentSession().save(supplier);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
