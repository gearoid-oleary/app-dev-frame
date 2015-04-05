package com.gearoidoleary;

import java.util.List;

public interface StudentRepository {

	void insert(Student student);
	
	List<Student> getAll();
}
