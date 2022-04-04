package com.asjy.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asjy.shopping.dao.AddressMapper;
import com.asjy.shopping.model.Address;
import com.asjy.shopping.service.IAddressService;
@Service
public class AddressServiceImpl implements IAddressService {
	@Resource
	AddressMapper addressMapper;
	/**
	 * 通过用户ID查询地址集合
	 */
	@Override
	public List<Address> selectByUserid(Integer userid) {
		List<Address> listAddress = addressMapper.selectByUserid(userid);
		return listAddress;
	}
	@Override
	public Address selectByPrimaryKey(Integer id) {
		Address address = addressMapper.selectByPrimaryKey(id);
		return address;
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int count = addressMapper.deleteByPrimaryKey(id);
		return count;
	}
	@Override
	public int insert(Address address) {
		int count = addressMapper.insert(address);
		return count;
	}
	@Override
	public int updateByPrimaryKey(Address address) {
		int count = addressMapper.updateByPrimaryKey(address);
		return count;
	}

}
