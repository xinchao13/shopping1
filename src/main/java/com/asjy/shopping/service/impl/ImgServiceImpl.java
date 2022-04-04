package com.asjy.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asjy.shopping.dao.ImgMapper;
import com.asjy.shopping.model.Img;
import com.asjy.shopping.service.IImgService;
@Service
public class ImgServiceImpl implements IImgService {
	@Resource
	ImgMapper imgMapper;
	/**
	 * 新增附图片方法
	 */
	@Override
	public int insert(Img img) {
		int count = imgMapper.insert(img);
		return count;
	}
	/**
	 * 查一个商品的所有附图
	 */
	@Override
	public List<Img> selectByGoodsId(Integer id) {
		List<Img> listImg = imgMapper.selectByGoodsId(id);
		return listImg;
	}
	@Override
	public Img findById(Integer id) {
		Img img = imgMapper.findById(id);
		return img;
	}
	@Override
	public int updateByPrimaryKey(Img img) {
		int count = imgMapper.updateByPrimaryKey(img);
		return count;
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int count = imgMapper.deleteByPrimaryKey(id);
		return count;
	}

}
