package com.spring.apps.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.apps.domain.Course;
import com.spring.apps.domain.CourseLevel;
import com.spring.apps.domain.Student;
import com.spring.apps.repository.CourseRepository;
import com.spring.apps.repository.StudentRepository;

@Component
public class SpringBoot implements ApplicationListener<ContextRefreshedEvent> {

	private CourseRepository courseRepository;
	private StudentRepository studentRepository;
	
	@Autowired
	public SpringBoot(CourseRepository courseRepository, StudentRepository studentRepository) {
		this.courseRepository = courseRepository;
		this.studentRepository = studentRepository;
	}


	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	public void init() {
		
		//Create course
		Course coreJava=new Course("Core Java",4,1500, CourseLevel.Basic);
		Course python=new Course("Python Basics",2,800, CourseLevel.Basic);
		Course dataAnalyticsPython=new Course("Data Anlytics with Python",2,1800, CourseLevel.Intermediate);
		Course spring=new Course("Spring 5.0",5,3000,CourseLevel.Advance);
		
		//Create student
		Student s1=new Student("John","Ma","888009911","john2Ma@yahoo.com");
		Student s2=new Student("Ryan","White","90012450","ryan_white@gmail.com");
		Student s3=new Student("Taylor","Smith","90238774","Taylor_Smith@citigroup.com.us");
		
		
		//Add course to students
//		s1.getCourseList().add(coreJava);
//		s1.getCourseList().add(python);
//		
//		s2.getCourseList().add(python);
//		s2.getCourseList().add(dataAnalyticsPython);
//		
//		s3.getCourseList().add(spring);
//		
//		
		//Save
		courseRepository.save(coreJava);
		courseRepository.save(python);
		courseRepository.save(dataAnalyticsPython);
		courseRepository.save(spring);
		
		
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		
	}
	
	
	
}
