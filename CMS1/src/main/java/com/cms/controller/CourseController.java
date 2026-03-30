package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cms.entity.Course;
import com.cms.service.CourseService;

@Controller
public class CourseController {
  @Autowired
private  CourseService service;
  
 @GetMapping("/")
  public String home(Model model) {
	  List<Course>list=service.getCourse();
	  model.addAttribute("Course",list);
	   return "home";
  }
  
  @GetMapping("/AddCourse")
  public String AddCourse(Model model) {
	  model.addAttribute("Course",new Course());
	  return "AddCourse";
  }
  @PostMapping("/saveCourse")
	public String saveCourse(Course c) {
	    service.saveCourse(c);
	    return "redirect:/";
	}

	@GetMapping("/deleteCourse")
	public String deleteCourse(int id) {
	    service.deleteCourse(id);
	    return "redirect:/";
	}

	
	@GetMapping("/editCourse")
	public String editCourse(int id, Model model) {
	    model.addAttribute("course", service.getCourseById(id));
	    return "editCourse";
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(Course c) {
	    service.updateCourse(c);
	    return "redirect:/";
	}
}