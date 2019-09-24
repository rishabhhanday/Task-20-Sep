package com.ssi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.DAOInterface;
import com.ssi.entities.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private DAOInterface studentDAO;
	
	@Override
	public void studentEntry(StudentEntity student) {
		studentDAO.addStudent(student);
	}

	@Override
	public void deleteStudent(int code) {
		studentDAO.removeStudent(code);
	}

	@Override
	public void changeStudentDetails(StudentEntity student) {
		studentDAO.updateStudent(student);
	}

	@Override
	public StudentEntity searchStudent(int code) {
		return studentDAO.getStudentById(code);
	}

	@Override
	public List<StudentEntity> viewAllStudents() {
		return studentDAO.getAllStudents();
	}
	
	public StudentEntity getStudent(int code){
		return studentDAO.getStudentById(code);
	}
}
