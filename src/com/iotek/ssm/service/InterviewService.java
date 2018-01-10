package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Interview;

public interface InterviewService {
	
	public int addInterview(Interview inter);
	
	public int delInterview(int id);
	
	public int updateInterview(Interview inter);
	
	public Interview queryById(int id);
	
	public List<Interview> queryAll();

}
