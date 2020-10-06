package com.spring.apps.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.apps.domain.Course;
import com.spring.apps.domain.Student;
import com.spring.apps.repository.CourseRepository;
import com.spring.apps.repository.StudentRepository;




public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public Student findStudentById(Integer studentId) {
		Optional<Student> optStudent=studentRepository.findById(studentId);
		Student student=optStudent.get();
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);

	}

	@Override
	public List<Student> findAllStudent() {
		List<Student> studentList= new ArrayList<Student>();
		studentRepository.findAll().iterator().forEachRemaining(studentList::add);	// Lamda Expressioon
		return studentList;
	}

}
