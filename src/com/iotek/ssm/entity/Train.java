package com.iotek.ssm.entity;

import java.util.Date;

public class Train {
	
	private int tId;
	private String name;
	private Date time;
	private Department dept;
	
	public Train() {
		super();
	}

	public Train(int tId, String name, Date time, Department dept) {
		super();
		this.tId = tId;
		this.name = name;
		this.time = time;
		this.dept = dept;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Train [tId=" + tId + ", name=" + name + ", time=" + time + ", dept=" + dept + "]";
	}

}
