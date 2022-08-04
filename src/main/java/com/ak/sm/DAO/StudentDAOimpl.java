package com.ak.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ak.sm.api.Student;
import com.ak.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOimpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		//data from db
		String sql="SELECT * FROM students";
		
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		
		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {
		
		//write the logic to store student obj to database
		Object[] sqlParameter={student.getName(),student.getMobile(),student.getCountry()};
		
		String sql="insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql,sqlParameter);
		
	}

	@Override
	public Student getStudent(int id) {
		String sql="SELECT * FROM STUDENTS WHERE ID=?";
		Student student=jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void update(Student student) {
		String sql="UPDATE STUDENTS SET name=?, mobile=?, country=? WHERE id=?";
		jdbcTemplate.update(sql, student.getName(),student.getMobile(),student.getCountry(),student.getId());
	
//		System.out.println("one record updateed");
	}

	@Override
	public void deleteStudent(int id) {
	
		String sql="DELETE FROM STUDENTS WHERE ID =?";
		jdbcTemplate.update(sql, id);
		
	}

}
