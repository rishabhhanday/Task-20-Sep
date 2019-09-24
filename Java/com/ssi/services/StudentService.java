package com.ssi.services;
import java.util.List;
import com.ssi.entities.StudentEntity;



public interface StudentService {
	public void studentEntry(StudentEntity student);
	public void deleteStudent(int code); 
	public void changeStudentDetails(StudentEntity student);
	public StudentEntity searchStudent(int code);
	public List<StudentEntity> viewAllStudents();
	public StudentEntity getStudent(int code);
}