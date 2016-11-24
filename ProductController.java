package com.suman.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.suman.ecom.dao.ProductDAO;
import com.suman.ecom.model.Product;

@Controller

public class ProductController {
	
	@Autowired
	ProductDAO productDAO;

	@Autowired
	Product product;

	
	@RequestMapping("/viewproducts")
	public String ShowViewproducts() {
		return "viewproducts";
	}

	@RequestMapping(value="/viewdetails")
    public ModelAndView showViewDetails(@RequestParam("id") String id,Model model)
	{
		    //RequestParam is used to get values in string format
		
			System.out.println("viewproduct paaaaaage");
			System.out.println("Id:"+id);
			
			//converting string to int
			int i=Integer.parseInt(id);
			model.addAttribute("productlist", productDAO.list());
			
			
			/*get product by id*/
			Product product1=productDAO.get(i);
			return new ModelAndView("viewdetails","product",product1);
		
		
    }

	
	
	@RequestMapping("/adminviewproducts")
	public String showAdminViewproducts() {
		return "adminviewproducts";
	}
	
	@RequestMapping(value="/deleteproduct&{id}")
    public ModelAndView showDeleteProd(@PathVariable("id") String id,Model model)throws Exception
	{
		   
			
			int i=Integer.parseInt(id);
			
			product=productDAO.get(i);

			System.out.println("product deleteeeee");
			
			ModelAndView mv=new ModelAndView("adminviewproducts");
			
			productDAO.delete(product);
			mv.addObject("adminviewproducts", 0);
			
			System.out.println("delete Id:"+id);
			
			
	  	    return mv;
		
		
    }



	
	@RequestMapping("/addproduct")
	public ModelAndView ShowAddProduct(Model model) {
		System.out.println("in product");
		ModelAndView mv=new ModelAndView("addproduct");
		model.addAttribute("productlist", productDAO.list());
		return mv;
	}

	// Creates empty obj and takes values frm user

	@ModelAttribute
	public Product returnObject() {
		return new Product();

	}

	@RequestMapping(value = "/addprod", method = RequestMethod.POST)
	public String ShowAddProduct(@Valid @ModelAttribute("product") Product product, Model model, BindingResult result,
			HttpServletRequest request) throws IOException {
		System.out.println(product.getProd_name());
		System.out.println("image uploaded");
		System.out.println("myproduct controller called");
		MultipartFile image = product.getImg();
		Path path;// belong to nio package
		path = Paths.get("E:/E-Commerce/frontend/src/main/webapp/resources/images/" + product.getProd_name() + ".jpg");
		System.out.println("Path=" + path);
		System.out.println("File name" + product.getImg().getOriginalFilename());
		if (image != null && !image.isEmpty()) {
			try {
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");

			}
		}
		productDAO.savOrUpdate(product);
		
		model.addAttribute("message","product added successfully");
		model.addAttribute("productList", productDAO.list());

		return "viewproducts";
	}

	String setName;
	List<Product> plist;

	@RequestMapping("GsonCon")
	// @ResponseBody is used whenever angularjs is used
	// for filtering and sorting -angular js
	// (google)gson converts java obj into json(java script obj)
	
	public @ResponseBody String getValues() throws Exception {
		String result = "";
		plist = productDAO.list();
		Gson gson = new Gson();
		result = gson.toJson(plist);
		return result;
	}

	


}
