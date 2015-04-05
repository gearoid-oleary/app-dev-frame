package com.gearoidoleary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcStudentRepository implements StudentRepository {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcStudentRepository (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(Student student) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into student(firstName, secondName, studentNumber, phoneNumber) values(?,?,?,?)", 
				student.getFirstName(), student.getSecondName(), student.getStudentNumber(), student.getPhoneNumber());
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		jdbcTemplate.query("select firstName, secondName, studentNumber, phoneNumber from student", new StudentRowMapper());
		
		return null;
	}

	class StudentRowMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			return null;
		}
		
		
		
		
	}
	
}
