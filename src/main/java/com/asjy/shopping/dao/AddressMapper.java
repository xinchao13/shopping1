package com.asjy.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Address;
@Mapper
public interface AddressMapper {
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
    int insert(Address record);

    int insertSelective(Address record);
    /**
     * 查询地址对象方法
     * @param id
     * @return
     */
    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);
    /**
     * 修改地址对象方法
     * @param record
     * @return
     */
    int updateByPrimaryKey(Address record);
    /**
     * 根据用户id查询地址集合
     * @param userid
     * @return
     */
    List<Address> selectByUserid(@Param("userid") Integer userid);
}