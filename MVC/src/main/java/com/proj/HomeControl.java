package com.proj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeControl {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getAllEmployees(Model model) {
//		Employees eee=new Employees();
//		eee.setName("Hello Everyone");
		
//		model.addAttribute("employeeName", eee.getName());
		return new ModelAndView("new");
	}
}
