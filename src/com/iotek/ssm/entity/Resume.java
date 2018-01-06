package com.iotek.ssm.entity;

public class Resume {
	
	private int rId;
	private String rName;
	private String gender;
	private int age;
	private String edu;
	private String tel;
	private String email;
	private Department dept;
	private Position post;
	private String politicalStatus;
	private String lastWork;
	private double workYears;
	private String salary;
	private String hobby;
	private int uId;
	
	public Resume() {
		super();
	}

	public Resume(int rId, String rName, String gender, int age, String edu, String tel, String email, Department dept,
			Position post, String politicalStatus, String lastWork, double workYears, String salary, String hobby,
			int uId) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.gender = gender;
		this.age = age;
		this.edu = edu;
		this.tel = tel;
		this.email = email;
		this.dept = dept;
		this.post = post;
		this.politicalStatus = politicalStatus;
		this.lastWork = lastWork;
		this.workYears = workYears;
		this.salary = salary;
		this.hobby = hobby;
		this.uId = uId;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
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

	public String getLastWork() {
		return lastWork;
	}

	public void setLastWork(String lastWork) {
		this.lastWork = lastWork;
	}

	public double getWorkYears() {
		return workYears;
	}

	public void setWorkYears(double workYears) {
		this.workYears = workYears;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "Resume [rId=" + rId + ", rName=" + rName + ", gender=" + gender + ", age=" + age + ", edu=" + edu
				+ ", tel=" + tel + ", email=" + email + ", dept=" + dept + ", post=" + post + ", politicalStatus="
				+ politicalStatus + ", lastWork=" + lastWork + ", workYears=" + workYears + ", salary=" + salary
				+ ", hobby=" + hobby + ", uId=" + uId + "]";
	}

}
