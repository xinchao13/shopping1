package com.asjy.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Img;
@Mapper
public interface ImgMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Img record);

    int insertSelective(Img record);
    /**
     * 通过货号查所有图片
     * @param id
     * @return
     */
    List<Img> selectByGoodsId(@Param("goodsid") Integer goodsid);
    /**
     * 通过id查图片对象
     * @param id
     * @return
     */
    Img findById(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Img record);
    /**
     * 修改图片对象
     * @param record
     * @return
     */
    int updateByPrimaryKey(Img record);
}