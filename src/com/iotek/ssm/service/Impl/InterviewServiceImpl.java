package com.iotek.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.InterviewDao;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.service.InterviewService;

@Service("interviewService")
public class InterviewServiceImpl implements InterviewService{
	
	@Autowired
	private InterviewDao interviewDao;

	@Override
	public int addInterview(Interview inter) {
		return interviewDao.addInterview(inter);
	}

	@Override
	public int delInterview(int id) {
		return interviewDao.delInterview(id);
	}

	@Override
	public int updateInterview(Interview inter) {
		return interviewDao.updateInterview(inter);
	}

	@Override
	public Interview queryById(int id) {
		return interviewDao.queryById(id);
	}

	@Override
	public List<Interview> queryAll() {
		return interviewDao.queryAll();
	}
	
	

}
