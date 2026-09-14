package com.sap.studentmgmtsap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sap.studentmgmtsap.model.Student;

public interface StudentRepository extends JpaRepository <Student,Integer> {

}
