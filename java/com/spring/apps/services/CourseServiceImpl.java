package com.spring.apps.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apps.domain.Course;
import com.spring.apps.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;
	
	
	
	@Autowired
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	@Override
	public Course findCourseById(Integer courseId) {
		Course course=courseRepository.findById(courseId).get();
		return course;
	}

	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);

	}

	@Override
	public void deleteCourse(Integer courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public List<Course> findAllCourse() {
		
		
		List<Course> courseList= new ArrayList<Course>();
		courseRepository.findAll().iterator().forEachRemaining(courseList::add);	// Lamda Expressioon
		return courseList;
	}

}
