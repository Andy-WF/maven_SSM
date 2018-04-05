package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.T_MALL_SHOPPINGCAR;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;

public interface CartMapper {


	List<T_MALL_SHOPPINGCAR> select_cart_list_by_user(T_MALL_USER_ACCOUNT select_user);

}
