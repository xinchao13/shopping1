package com.asjy.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Brand;
@Mapper
public interface BrandMapper {

    int deleteByPrimaryKey(Integer id);

    /**
     *	添加一个品牌方法
     * @mbggenerated
     */
    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
    /**
     * 查询所有品牌方法
     * @return
     */
    List<Brand> selectAll();
    /**
     * 根据名字查品牌对象
     * @param brandName
     * @return
     */
    Brand selectByName(@Param("brandName") String brandName);
    /**
     * 查询推荐品牌
     * @return
     */
    List<Brand> selectByRec();
}