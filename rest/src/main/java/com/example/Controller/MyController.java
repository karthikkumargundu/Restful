package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Course;
import com.example.Services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService cs;
	/*
	 * @GetMapping("/home") public String home() { return "This is Home Page"; }
	 */
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.cs.getCourses();  
	}
	@GetMapping("/courses/{courseid}")
	public Course getCourse(@PathVariable String courseid)
	{
		return this.cs.getCourse(Long.parseLong(courseid));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course c)
	{
		return this.cs.addcourse(c);
	}
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course c)
	{
		return this.cs.updatecourse(c);
	}
	
    @DeleteMapping("/{coursenum}")
    public void delete(@PathVariable("coursenum") int id)
    {
    	cs.deletecourse(id);
    }
}
	
	  
