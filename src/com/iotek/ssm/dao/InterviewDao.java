package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Interview;

public interface InterviewDao {
	
	public int addInterview(Interview inter);
	
	public int delInterview(int id);
	
	public int updateInterview(Interview inter);
	
	public Interview queryById (int id);
	
	public List<Interview> queryAll();

}
