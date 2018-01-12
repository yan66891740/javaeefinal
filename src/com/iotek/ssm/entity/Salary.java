package com.iotek.ssm.entity;

import java.util.Date;

public class Salary {
	
	private int sId;
	private int uId;
	private int year;
	private int month;
	private double allsalary;
	private double basicsalary;
	private double performance;
	private double overtime;
	private double randp;
	private double security;
	
	public Salary() {
		super();
	}

	public Salary(int sId, int uId, int year, int month, double allsalary, double basicsalary, double performance,
			double overtime, double randp, double security) {
		super();
		this.sId = sId;
		this.uId = uId;
		this.year = year;
		this.month = month;
		this.allsalary = allsalary;
		this.basicsalary = basicsalary;
		this.performance = performance;
		this.overtime = overtime;
		this.randp = randp;
		this.security = security;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getAllsalary() {
		return allsalary;
	}

	public void setAllsalary(double allsalary) {
		this.allsalary = allsalary;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public double getPerformance() {
		return performance;
	}

	public void setPerformance(double performance) {
		this.performance = performance;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public double getRandp() {
		return randp;
	}

	public void setRandp(double randp) {
		this.randp = randp;
	}

	public double getSecurity() {
		return security;
	}

	public void setSecurity(double security) {
		this.security = security;
	}

	@Override
	public String toString() {
		return "Salary [sId=" + sId + ", uId=" + uId + ", year=" + year + ", month=" + month + ", allsalary="
				+ allsalary + ", basicsalary=" + basicsalary + ", performance=" + performance + ", overtime=" + overtime
				+ ", randp=" + randp + ", security=" + security + "]";
	}
	
}
