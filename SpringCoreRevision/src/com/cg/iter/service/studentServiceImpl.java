package com.cg.iter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;

@Service("studentService")
public class studentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studDao;
	public studentServiceImpl() {
		System.out.println("Stud service constructor");
	}
	@Override
	public boolean create(Student stud) {
		// TODO Auto-generated method stub
		return studDao.create(stud);
	}
	@Override
	public Student findStudentById(int id) {
		return studDao.findStudentById(id);
	}

	@Override
	public boolean updateStudent(Student stud) {
		return studDao.updateStudent(stud);
	}

	@Override
	public Student findStudentByName(String name) {
		return studDao.findStudentByName(name);
	}

	@Override
	public boolean deleteStudent(int id) {
		return studDao.deleteStudent(id);
	}
	
	@Override
	public List<Student> findAllStudents() {
		return studDao.findAllStudents();
	}

	
}
