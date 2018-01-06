package com.iotek.ssm.entity;

public class Position {
	
	private int pId;
	private String pName;
	private String pCreatetime;
	private Department dept;
	
	public Position() {
		super();
	}

	public Position(int pId, String pName, String pCreatetime) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCreatetime = pCreatetime;
	}

	public Position(int pId, String pName, String pCreatetime, Department dept) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCreatetime = pCreatetime;
		this.dept = dept;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCreatetime() {
		return pCreatetime;
	}

	public void setpCreatetime(String pCreatetime) {
		this.pCreatetime = pCreatetime;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Position [pId=" + pId + ", pName=" + pName + ", pCreatetime=" + pCreatetime + ", dept=" + dept + "]";
	}

}
