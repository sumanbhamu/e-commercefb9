package com.suman.ecom.dao;

import java.util.List;

import com.suman.ecom.model.Category;



/*@Repository*/
public interface CategoryDAO 
{
    public boolean save(Category category);
	
	public boolean delete(Category category);
	public Category get(int id);
	//collection of category list
	public List<Category> list();
	

}
