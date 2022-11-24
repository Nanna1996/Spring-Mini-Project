package com.example.demo.entity;

public class StudentModel {
	
	private Integer sid;
	//@NotEmpty(message = "Name shouldn't be empty")
	private String name;
	
	private int marks;
	//@NotEmpty(message = "school name shouldn't be blank and empty")
	private String school;
	
	private long phno;
	//@Email(message = "Invalid email id ")
	private String email;
	//@NotEmpty(message = "address details are mandotary")
	private String address;
	//@ValidStudentType
	private String gradeType;
	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

//	public StudentModel(Integer sid, @NotEmpty(message = "Name shouldn't be empty") String name, int marks,
//			@NotEmpty(message = "school name shouldn't be blank and empty") String school, long phno,
//			@Email(message = "Invalid email id ") String email,
//			@NotEmpty(message = "address details are mandotary") String address, String gradeType) {
//		super();
//		this.sid = sid;
//		this.name = name;
//		this.marks = marks;
//		this.school = school;
//		this.phno = phno;
//		this.email = email;
//		this.address = address;
//		this.gradeType = gradeType;
//	}

	
	@Override
	public String toString() {
		return "StudentModel [sid=" + sid + ", name=" + name + ", marks=" + marks + ", school=" + school + ", phno="
				+ phno + ", email=" + email + ", address=" + address + ", gradeType=" + gradeType + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGradeType() {
		return gradeType;
	}

	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
	
	

}
