package org.shiwei.service.impl;

import org.shiwei.entity.Student;
import org.shiwei.mapper.StudentMapper;
import org.shiwei.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentMapper studentMapper;
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	
	@Override
	public void addStudent(Student student) {
	//	����dao ��
		studentMapper.addStudent(student);
		
	}

}
