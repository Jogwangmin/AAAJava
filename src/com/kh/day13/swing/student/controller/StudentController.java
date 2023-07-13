package com.kh.day13.swing.student.controller;

import java.util.List;

import com.kh.day10.collection.student.Student;

public class StudentController {
	List<Student> stdList;
	
	public void addStudent(Student stdOne) {
		stdList.add(stdOne);
	}
}
