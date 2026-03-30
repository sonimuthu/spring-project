package com.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cms.entity.Course;

@Repository
public class CourseDao{

@Autowired	
private static List<Course> list =new ArrayList();	
	static {
		Course c=new Course();
		c.setId(1);
		c.setName("Rishi");
		c.setInstructor("Anu");
		list.add(c);
	}
	public List<Course>getCourse(){
		 return list;
		  
	 }
	 public void save(Course c) {
	        list.add(c);
	    }	
	 public void delete(int id) {
	        list.removeIf(course -> course.getId() == id);
	    }
	 public Course getById(int id) {
	        for (Course c : list) {
	            if (c.getId() == id) {
	                return c;
	            }
	        }
	        return null;
	    }
	 
	 public void update(Course updated) {
	        for (Course c : list) {
	            if (c.getId() == updated.getId()) {
	                c.setName(updated.getName());
	                c.setInstructor(updated.getInstructor());
	            }
	        }
	}

}

