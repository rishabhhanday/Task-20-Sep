package com.ssi.dao;

import java.util.List;

import com.ssi.entities.StudentEntity;

public interface DAOInterface {
	public void addStudent(StudentEntity student);
	public void removeStudent(int code);
	public void updateStudent(StudentEntity student);
	public StudentEntity getStudentById(int code);
	public List<StudentEntity> getAllStudents();
}
