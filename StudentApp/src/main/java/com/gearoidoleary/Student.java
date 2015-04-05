package com.gearoidoleary;

public class Student {

	private String firstName;
	private String secondName;
	private String studentNumber;
	private String phoneNumber;
	
	public Student(){
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "todo [firstName=" + firstName + ", secondName=" + secondName
				+ ", studentNumber=" + studentNumber + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
}
