package com.iotek.ssm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.ResumeService;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{
	
	@Autowired
	private ResumeDao resumeDao;

	@Override
	public Resume queryByUid(Integer id) {
		return resumeDao.queryById(id);
	}

	@Override
	public int addResume(Resume resume) {
		return resumeDao.addResume(resume);
	}

	@Override
	public int updateResume(Resume resume) {
		return resumeDao.updateResume(resume);
	}

}
