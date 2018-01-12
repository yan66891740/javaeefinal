package com.iotek.ssm.entity;

import java.util.Date;

public class Attence {
	
	private int aId;
	private Date am;
	private int late;
	private Date pm;
	private int left;
	private int uId;
	
	public Attence() {
		super();
	}

	public Attence(int aId, Date am, int late, Date pm, int left, int uId) {
		super();
		this.aId = aId;
		this.am = am;
		this.late = late;
		this.pm = pm;
		this.left = left;
		this.uId = uId;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public Date getAm() {
		return am;
	}

	public void setAm(Date am) {
		this.am = am;
	}

	public int getLate() {
		return late;
	}

	public void setLate(int late) {
		this.late = late;
	}

	public Date getPm() {
		return pm;
	}

	public void setPm(Date pm) {
		this.pm = pm;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "Attence [aId=" + aId + ", am=" + am + ", late=" + late + ", pm=" + pm + ", left=" + left + ", uId="
				+ uId + "]";
	}

}
