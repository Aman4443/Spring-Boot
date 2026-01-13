package com.in28min.springBoot.learn_spring_Boot;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		 return Arrays.asList(
	                new Course(1, "Learn AWS", "in28minutes"),
	                new Course(2, "Learn DevOps", "in28minutes")
	        );
	}

}
