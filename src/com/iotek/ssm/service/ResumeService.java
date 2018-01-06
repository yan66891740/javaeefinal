package com.iotek.ssm.service;

import com.iotek.ssm.entity.Resume;

public interface ResumeService {

	public Resume queryByUid(Integer id);

	public int addResume(Resume resume);

	public int updateResume(Resume resume);

}
