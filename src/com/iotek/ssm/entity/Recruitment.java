package com.iotek.ssm.entity;

import java.util.Date;

public class Recruitment {
	
	private int id;
	private Department dept;
	private Position post;
	private String info;
	private Date createTime;
	private int type;
	
	public Recruitment() {
		super();
	}

	public Recruitment(int id, Department dept, Position post, String info, Date createTime, int type) {
		super();
		this.id = id;
		this.dept = dept;
		this.post = post;
		this.info = info;
		this.createTime = createTime;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Recruitment [id=" + id + ", dept=" + dept + ", post=" + post + ", info=" + info + ", createTime="
				+ createTime + ", type=" + type + "]";
	}

}
