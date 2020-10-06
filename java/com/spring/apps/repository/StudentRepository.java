package com.spring.apps.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.apps.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
