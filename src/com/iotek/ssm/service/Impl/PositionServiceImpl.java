package com.iotek.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Position;

@Service("positionService")
public class PositionServiceImpl {
	
	@Autowired
	private PositionDao positionDao;
	
	public List<Position> queryByDid(Integer id){
		return positionDao.queryByDeptId(id);
	}

}
