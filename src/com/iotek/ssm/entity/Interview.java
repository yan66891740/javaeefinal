package com.iotek.ssm.entity;

import java.util.Date;

public class Interview {
	
	private int iId;
	private int uId;
	private String name;
	private Department dept;
	private Date createTime;
	private String check;
	private String audition;
	private Date forInter;
	private String employ;
	
	public Interview() {
		super();
	}

	public Interview(int iId, int uId, String name, Department dept, Date createTime, String check, String audition,
			Date forInter, String employ) {
		super();
		this.iId = iId;
		this.uId = uId;
		this.name = name;
		this.dept = dept;
		this.createTime = createTime;
		this.check = check;
		this.audition = audition;
		this.forInter = forInter;
		this.employ = employ;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getAudition() {
		return audition;
	}

	public void setAudition(String audition) {
		this.audition = audition;
	}

	public Date getForInter() {
		return forInter;
	}

	public void setForInter(Date forInter) {
		this.forInter = forInter;
	}

	public String getEmploy() {
		return employ;
	}

	public void setEmploy(String employ) {
		this.employ = employ;
	}

	@Override
	public String toString() {
		return "Interview [iId=" + iId + ", uId=" + uId + ", name=" + name + ", dept=" + dept + ", createTime="
				+ createTime + ", check=" + check + ", audition=" + audition + ", forInter=" + forInter + ", employ="
				+ employ + "]";
	}

}