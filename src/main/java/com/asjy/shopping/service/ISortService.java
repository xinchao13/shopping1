package com.asjy.shopping.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asjy.shopping.model.Sort;
public interface ISortService {

	/**
     * 查询分类名称
     * @param sort
     * @return
     */
    List<Sort> findAllSort(Integer parentid);
    /**
     * ajax修改
     * @param id
     * @param value
     * @param fieldName
     * @return
     */
    public Map<String, Object> ajaxUpdate(String id, String value, String fieldName);
    /**
     * 添加新的分类
     * @param record
     * @return
     */
    int insert(Sort sort) throws Exception;
    /**
     * 通过分类名称查询
     * @param sortName
     * @return
     */
    Sort findByName(String sortName);
    /**
     * 通过id查分类对象
     * @param id
     * @return
     */
    Sort findById(Integer id);
    /**
     * 更改分类对象
     * @param sort
     * @return
     */
    int updateByPrimaryKey(Sort sort) throws Exception;
    /**
     * 删除分类对象
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id) throws Exception;
    /**
     * 查询有层级分类名称
     * @param sort
     * @return
     */
    List<Sort> getAllSort();
    /**
     * 得到二级的id，删除二级下的三级分类
     * @param id
     * @return
     */
    int deletesort3(Integer id);
}
