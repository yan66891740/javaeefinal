package com.iotek.ssm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.RecruitmentDao;
import com.iotek.ssm.service.RecruitmentService;

@Service("recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService{
	
	@Autowired
	private RecruitmentDao recruitmentDao;

}
