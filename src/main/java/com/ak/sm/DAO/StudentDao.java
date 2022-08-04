package com.ak.sm.DAO;

import java.util.List;

import com.ak.sm.api.Student;

public interface StudentDao {
	
	List<Student> loadStudents();
	
	void saveStudent(Student student);
	
	Student getStudent(int id);

	void update(Student student);

	void deleteStudent(int id);

}
