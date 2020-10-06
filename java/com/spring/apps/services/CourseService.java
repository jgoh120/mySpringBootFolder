package com.spring.apps.services;

import java.util.List;
import java.util.Optional;

import com.spring.apps.domain.Course;

public interface CourseService {
	public void addCourse(Course course);
	public Course findCourseById(Integer courseId);
	public void updateCourse(Course course);
	public void deleteCourse(Integer courseId);
	public List<Course> findAllCourse();
}
