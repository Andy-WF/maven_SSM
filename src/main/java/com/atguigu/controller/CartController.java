package com.atguigu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.bean.T_MALL_SHOPPINGCAR;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.service.CartService;

@Controller
public class CartController {
	
	
	@Autowired
	CartService cartService;
	
	
	//购物车--查        鼠标悬停显示mini购物车数据
	@RequestMapping("goto_cart_list")
	public String mingoto_cart_listiCart (ModelMap map ) {
		
		List<T_MALL_SHOPPINGCAR> list_cart = new ArrayList<>();
		T_MALL_USER_ACCOUNT user = new T_MALL_USER_ACCOUNT();
		user.setId(1);
		
		list_cart = cartService.get_cart_list_by_user(user);
		map.put("list_cart", list_cart);
		return "cartList";
	}

		
}
