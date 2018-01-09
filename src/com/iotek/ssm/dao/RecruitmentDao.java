package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Recruitment;

public interface RecruitmentDao {
	
	public int addRecruitment(Recruitment rec);
	
	public int delRecruitment(int id);
	
	public int updateRecruitment(Recruitment rec);
	
	public List<Recruitment> queryAll();

}
