package com.asjy.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Specv;
@Mapper
public interface SpecvMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_specv
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_specv
     *
     * @mbggenerated
     */
    int insert(Specv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_specv
     *
     * @mbggenerated
     */
    int insertSelective(Specv record);
    /**
     * 通过规格值id查规格值对象，里面包含规格的id
     * @param id
     * @return
     */
    Specv selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_specv
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Specv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_specv
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Specv record);
    /**
     * 根据specid查规格值集合
     * @param specid
     * @return
     */
    List<Specv> selectBySpecid(@Param("specid") Integer specid);
}