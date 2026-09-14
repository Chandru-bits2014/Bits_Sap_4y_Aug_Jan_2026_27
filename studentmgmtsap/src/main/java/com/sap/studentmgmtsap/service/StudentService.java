package com.sap.studentmgmtsap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sap.studentmgmtsap.model.Student;

@Service
public interface StudentService {
	
	public List <Student> getAllStudents();
	public Student getStudentById(int studId);
	public void deleteStduentById(int studId);
	public Student updateStudent(int studId,Student student);
	public Student saveStudent(Student student);

}
