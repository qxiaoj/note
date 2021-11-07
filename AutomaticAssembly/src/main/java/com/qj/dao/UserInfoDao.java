package com.qj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qj.entity.UserInfo;

public interface UserInfoDao {

	@Select("select * from userinfo")
	List<UserInfo> findAll();

}
