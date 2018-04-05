package com.atguigu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_SHOPPINGCAR;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.mapper.CartMapper;
import com.atguigu.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<T_MALL_SHOPPINGCAR> get_cart_list_by_user(T_MALL_USER_ACCOUNT select_user) {
		
		return cartMapper.select_cart_list_by_user(select_user);
	}
	
	
	
	
}
