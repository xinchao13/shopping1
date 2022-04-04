package com.asjy.shopping.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Address;

public interface IAddressService {
	/**
     * 根据用户id查询地址集合
     * @param userid
     * @return
     */
    List<Address> selectByUserid(@Param("userid") Integer userid);
    /**
     * 查询地址对象方法
     * @param id
     * @return
     */
    Address selectByPrimaryKey(Integer id);
	/**
	 * 根据主键删除一条地址记录
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Integer id);
    /**
     * 新增地址方法
     * @param record
     * @return
     */
    int insert(Address address);
    /**
     * 修改地址对象方法
     * @param record
     * @return
     */
    int updateByPrimaryKey(Address address);
}
