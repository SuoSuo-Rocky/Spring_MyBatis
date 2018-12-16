package org.shiwei.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.shiwei.entity.Student;
import org.shiwei.mapper.StudentMapper;

public class StudentDaoImpl  extends SqlSessionDaoSupport implements StudentMapper{

	
	@Override
	public void addStudent(Student student) {
		SqlSession session = super.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		mapper.addStudent(student);
		
	}
}
