package com.iotek.ssm.entity;

import java.util.Date;

public class Employee {
	
	private int eId;
	private String eName;
	private String gender;
	private int age;
	private String edu;
	private String tel;
	private String email;
	private Department dept;
	private Position post;
	private String politicalStatus;
	private Date hiredate;
	private String hobby;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String eName, String gender, int age, String edu, String tel, String email,
			Department dept, Position post, String politicalStatus, Date hiredate, String hobby) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.gender = gender;
		this.age = age;
		this.edu = edu;
		this.tel = tel;
		this.email = email;
		this.dept = dept;
		this.post = post;
		this.politicalStatus = politicalStatus;
		this.hiredate = hiredate;
		this.hobby = hobby;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Position getPost() {
		return post;
	}

	public void setPost(Position post) {
		this.post = post;
	}

	public String getPoliticalStatus() {
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", gender=" + gender + ", age=" + age + ", edu=" + edu
				+ ", tel=" + tel + ", email=" + email + ", dept=" + dept + ", post=" + post + ", politicalStatus="
				+ politicalStatus + ", hiredate=" + hiredate + ", hobby=" + hobby + "]";
	}

}
