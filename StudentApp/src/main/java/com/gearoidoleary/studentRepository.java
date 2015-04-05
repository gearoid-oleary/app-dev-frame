package com.gearoidoleary;

import java.util.List;

public interface studentRepository {

	void insert(Student todo);
	
	List<Student> getAll();
}
