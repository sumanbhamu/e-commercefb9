package com.suman.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suman.ecom.dao.CategoryDAO;
import com.suman.ecom.dao.SupplierDAO;
import com.suman.ecom.model.Category;
import com.suman.ecom.model.Supplier;

@Controller

public class AdminController {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Category category;

	@Autowired
	SupplierDAO supplierDAO;

	/*
	 * @Autowired Supplier supplier;
	 */

	@RequestMapping("/adminhome")
	public String ShowAdminHome() {
		return "adminhome";
	}

	@RequestMapping("/addcategory")
	public String ShowAddCategory() {
		return "addcategory";
	}

	@RequestMapping("/addsupplier")
	public String ShowAddSupplier() {
		return "addsupplier";
	}

	
	// Creates empty obj and takes values frm user

	@ModelAttribute
	public Category returnObject1() {
		return new Category();

	}

	@ModelAttribute
	public Supplier returnObject2() {
		return new Supplier();

	}

	/*
	 * //////////////////////////////////////////////////
	 */

	@RequestMapping(value = "/addcat", method = RequestMethod.POST)
	public String addCate(@ModelAttribute("category") Category category, BindingResult result,
			HttpServletRequest request) {
		categoryDAO.save(category);
		return "viewproducts";

	}

	@RequestMapping(value = "/addsup", method = RequestMethod.POST)
	public String addSupp(@ModelAttribute("supplier") Supplier supplier, BindingResult result,
			HttpServletRequest request) {
		supplierDAO.savOrUpdate(supplier);
		return "viewproducts";

	}

	/*
	 * ////////////////////////////////////////////////////////////
	 */

	
}
