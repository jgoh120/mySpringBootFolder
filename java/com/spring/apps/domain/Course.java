package com.spring.apps.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@Table(name="AllCourse")
public class Course {
	@Id //denotes primary key column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private int duration;
	private double fee;
	
	//course level (basic, int or advance)
	@Enumerated(EnumType.STRING)
	private CourseLevel courseLevel;
	
	@ManyToOne
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String courseName, int duration, double fee, CourseLevel courseLevel) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.courseLevel=courseLevel;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}


	
	
	public CourseLevel getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(CourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", courseLevel=" + courseLevel + "]";
	}
	
}

