package com.student;

public class StudentPojo {
	private String sid;
	private String name;
	private String dob;
	public StudentPojo(String sid, String name, String dob) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = dob;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
