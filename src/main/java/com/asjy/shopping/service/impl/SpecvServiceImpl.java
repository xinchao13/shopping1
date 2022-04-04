package com.asjy.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asjy.shopping.dao.SpecvMapper;
import com.asjy.shopping.model.Specv;
import com.asjy.shopping.service.ISpecvService;
@Service
public class SpecvServiceImpl implements ISpecvService {
	
	@Resource
	SpecvMapper specvMapper;
	/**
	 * 根据specid查规格值集合
	 */
	@Override
	public List<Specv> selectBySpecid(Integer specid) {
		List<Specv> listSpecv = specvMapper.selectBySpecid(specid);
		return listSpecv;
	}
	@Override
	public Specv selectByPrimaryKey(Integer id) {
		Specv specv = specvMapper.selectByPrimaryKey(id);
		return specv;
	}

}
