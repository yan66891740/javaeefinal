package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionService {
	
	public List<Position> queryByDid(Integer id);

}
