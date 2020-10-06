package com.spring.apps.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Course> courseList=new ArrayList<Course>();
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(String fname, String lname, String mobile, String email, List<Course> courseList) {
	
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.courseList = courseList;
	}
	
	
	public Student(String fname, String lname, String mobile, String email) {
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
	}

	public void addCourse(Course course) {
		course.setStudent(this);
		this.getCourseList().add(course);
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmailed(String email) {
		this.email = email;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", email="
				+ email + ", courseList=" + courseList + "]";
	}
	
	
	
}
