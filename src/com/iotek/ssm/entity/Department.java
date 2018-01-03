package com.iotek.ssm.entity;

import java.util.Date;

public class Department {
	
	private int dId;
	private String dName;
	private Date dCreatetime;
	
	public Department() {
		super();
	}

	public Department(int dId, String dName, Date dCreatetime) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dCreatetime = dCreatetime;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Date getdCreatetime() {
		return dCreatetime;
	}

	public void setdCreatetime(Date dCreatetime) {
		this.dCreatetime = dCreatetime;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dCreatetime=" + dCreatetime + "]";
	}

}
