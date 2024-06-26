package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Student;

public interface IStudentService {
	Student getStudentObj();
	boolean setStudent(Student obj);
	ArrayList<Student> getStudentData();
	Student getStudentDataById(int id);
	List<Student> getStudentDataByName(String name);
	double getStudentGPA(int id);
}
