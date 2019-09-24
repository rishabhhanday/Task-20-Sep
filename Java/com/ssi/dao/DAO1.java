package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ssi.entities.StudentEntity;

@Repository
public class DAO1 implements DAOInterface{
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void addStudent(StudentEntity student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}

	@Override
	public void removeStudent(int code) {
		Session session=sessionFactory.openSession();
		StudentEntity student=session.get(StudentEntity.class, code);
		Transaction tr=session.beginTransaction();
		session.delete(student);
		tr.commit();
		session.close();
	}

	@Override
	public void updateStudent(StudentEntity student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
	}

	@Override
	public StudentEntity getStudentById(int code) {
		Session session=sessionFactory.openSession();
		StudentEntity student=session.get(StudentEntity.class, code);
		session.close();
		return student;
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(StudentEntity.class);
		List<StudentEntity> students=cr.list();
		session.close();
		return students;
	}

}
