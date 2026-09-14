package com.sap.studentmgmtsap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="students")
public class Student {
	
	@Column(name="studentId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studId;
	
	@Column(name="studentName")
	String studName;
	
	@Column(name="studentCourse")
	String studCourse;
	
	@Column(name="studentMail")
	String studMail;
	
	@Column(name="avgScore")
	int avgScore;
	
	

	public Student() {
		super();
	}



	public Student(int studId, String studName, String studCourse, String studMail, int avgScore) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCourse = studCourse;
		this.studMail = studMail;
		this.avgScore = avgScore;
	}



	public Student(String studName, String studCourse, String studMail, int avgScore) {
		super();
		this.studName = studName;
		this.studCourse = studCourse;
		this.studMail = studMail;
		this.avgScore = avgScore;
	}



	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getStudName() {
		return studName;
	}



	public void setStudName(String studName) {
		this.studName = studName;
	}



	public String getStudCourse() {
		return studCourse;
	}



	public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
	}



	public String getStudMail() {
		return studMail;
	}



	public void setStudMail(String studMail) {
		this.studMail = studMail;
	}



	public int getAvgScore() {
		return avgScore;
	}



	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}
	
	

}
