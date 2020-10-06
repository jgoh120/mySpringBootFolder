package com.spring.apps.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.apps.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
