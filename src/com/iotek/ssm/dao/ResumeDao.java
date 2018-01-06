package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {
	
	public int addResume(Resume resume);
	
	public int delResume(int id);
	
	public int updateResume(Resume emp);
	
	public Resume queryById(int id);
	
	public List<Resume> queryAll();

}
