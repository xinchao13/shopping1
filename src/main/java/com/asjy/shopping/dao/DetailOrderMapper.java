package com.asjy.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.DetailOrder;
@Mapper
public interface DetailOrderMapper {

    int deleteByPrimaryKey(Integer id);

    /**
     * 新增一条详单记录
     * @param record
     * @return
     */
    int insert(DetailOrder record);

    int insertSelective(DetailOrder record);

    DetailOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailOrder record);

    int updateByPrimaryKey(DetailOrder record);
    /**
     * 根据订单主键查询详单对象
     * @param ordernum
     * @return
     */
    List<DetailOrder> selectByOrdernum(@Param("ordernum") Integer ordernum);
}