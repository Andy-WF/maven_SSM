package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.T_MALL_SHOPPINGCAR;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;

public interface CartService {


	List<T_MALL_SHOPPINGCAR> get_cart_list_by_user(T_MALL_USER_ACCOUNT select_user);

}
