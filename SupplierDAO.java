package com.suman.ecom.dao;

import java.util.List;

import com.suman.ecom.model.Supplier;



public interface SupplierDAO {
	
public boolean savOrUpdate(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier get(int id);
	
	//collection of supplier list
	public List<Supplier> list();
	

}
