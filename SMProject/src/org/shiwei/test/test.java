package org.shiwei.test;

import org.shiwei.entity.Student;
import org.shiwei.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService service = (IStudentService) context.getBean("studentService");
		Student student = new Student();
		student.setStuNo(777);
		student.setStuAge(100);
		student.setStuName("999");
		service.addStudent(student);
		
		
		
		
	}
	

}
