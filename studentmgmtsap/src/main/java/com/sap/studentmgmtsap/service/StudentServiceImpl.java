package com.sap.studentmgmtsap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.studentmgmtsap.model.Student;
import com.sap.studentmgmtsap.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository studRepo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studRepo.findAll();
	}

	@Override
	public Student getStudentById(int studId) {
		// TODO Auto-generated method stub
		return studRepo.findById(studId).get();
	}

	@Override
	public void deleteStduentById(int studId) {
		// TODO Auto-generated method stub
		studRepo.deleteById(studId);
	}

	@Override
	public Student updateStudent(int studId, Student student) {
		// TODO Auto-generated method stub
		Student studentU = getStudentById(studId);
		studentU.setStudName(student.getStudName());
		studentU.setStudMail(student.getStudMail());
		studentU.setStudCourse(student.getStudCourse());
		studentU.setAvgScore(student.getAvgScore());
		
		studRepo.save(studentU);
		return studentU;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studRepo.save(student);
	}

}
