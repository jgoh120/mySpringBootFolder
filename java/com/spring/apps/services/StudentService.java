package com.spring.apps.services;

import java.util.List;

import com.spring.apps.domain.Student;

public interface StudentService {
	public void addStudent(Student student);
	public Student findStudentById(Integer studentId);
	public void updateStudent(Student student);
	public void deleteStudent(Integer studentId);
	public List<Student> findAllStudent();
}
