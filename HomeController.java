package com.suman.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suman.ecom.dao.UserDAO;
import com.suman.ecom.model.User;

@Controller
public class HomeController {
	@Autowired
	private UserDAO userDAO;

	@Autowired
	User user;

	@RequestMapping("/")
	public String showHome() {
		return "index";
	}

	@RequestMapping("/home")
	public String ShowHome() {
		return "index";
	}

	@RequestMapping("/aboutus")
	public String showAboutUs() {
		return "aboutus";
	}

	@RequestMapping("/login")
	public String showLogin() {
		System.out.println("loginnnnnnnn");
		// ModelAndView mv = new ModelAndView("login");

		return "login";
	}

	@RequestMapping("/register")
	public ModelAndView ShowRegister() {
		System.out.println("registerrrr");
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@ModelAttribute
	public User returnObject() {
		return new User();
	}

	@RequestMapping(value = "/addus", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, BindingResult result,HttpServletRequest request) {
		System.out.println(user.getConfirmpassword());
		System.out.println(user.getPassword());
		//ModelAndView mv = new ModelAndView("register");
		user.setEnabled("true");
		user.setRole("ROLE_USER");

		if (user.getConfirmpassword().equals(user.getPassword())) {
			userDAO.saveOrUpdate(user);
		}

		return "login";

	}

	/*
	 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * \\\
	 */

	@RequestMapping("/validate")
	public ModelAndView checkUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv;
		String s1, s2;
		s1 = request.getParameter("ema1");
		s2 = request.getParameter("psd");
		mv = new ModelAndView("/login");
		System.out.println(s1 + "" + s2);
		user = userDAO.get(s1);
		System.out.println(user.getEmailid());
		
		//if role is admin then return admin
		if (user.getRole().equals("ROLE_ADMIN")) {
			mv = new ModelAndView("adminhome");
		} 
		//if role is user then return index
		else if (user.getRole().equals("ROLE_USER")) {
			mv = new ModelAndView("index");

		}
		return mv;
	}

}
