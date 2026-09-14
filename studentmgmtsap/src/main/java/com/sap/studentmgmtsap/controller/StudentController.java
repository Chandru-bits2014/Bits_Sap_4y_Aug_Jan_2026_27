package com.sap.studentmgmtsap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.studentmgmtsap.model.Student;
import com.sap.studentmgmtsap.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studSvc;
	
	
	@GetMapping("/getAll")
	public List <Student> getAllStudentsC()
	{
		return studSvc.getAllStudents();
	}
	
	@GetMapping("/ById/{studId}")
	public Student getStudentByIdC(@PathVariable int studId)
	{
		return studSvc.getStudentById(studId);
	}
	
	@PutMapping("/update/{studId}")
	public Student updateStudentC(@RequestBody Student student,@PathVariable int studId)
	{
		return studSvc.updateStudent(studId, student);
	}
	
	@PostMapping("/save")
	public Student saveStudentC(@RequestBody Student student)
	{
		return studSvc.saveStudent(student);
	}
	//public String deleteStudentByIdC(@RequestParam int studId)
	@DeleteMapping("/delete/{studId}")
	public String deleteStudentByIdC(@PathVariable int studId)
	{
		studSvc.deleteStduentById(studId);
		return "Student Record Deleted Successfully..";
	}

}
