package com.suman.ecom.dao;

import java.util.List;

import com.suman.ecom.model.Product;




public interface ProductDAO 
{
	public boolean savOrUpdate(Product product);
	
	public boolean delete(Product product);
	public Product get(int id);
	
	//collection of products list
	public List<Product> list();
	
	
}
