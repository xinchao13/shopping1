package com.asjy.shopping.service;

import java.util.List;

import com.asjy.shopping.model.Specv;

public interface ISpecvService {
	/**
     * 根据specid查规格值集合
     * @param specid
     * @return
     */
    List<Specv> selectBySpecid(Integer specid);
    Specv selectByPrimaryKey(Integer id);
}
