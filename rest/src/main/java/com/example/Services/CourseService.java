package com.example.Services;

import java.util.List;

import com.example.Entity.Course;

public interface CourseService
{

	public List<Course> getCourses();
	public Course getCourse(long courseid);
	public Course addcourse(Course c);
	public Course updatecourse(Course c);
	public String deletecourse(int id);
}