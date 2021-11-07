package com.qj.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.qj.dao.UserInfoDao;
import com.qj.entity.UserInfo;
import com.qj.utils.MybatisUtil;

public class UserInfoServiceImpl implements UserInfoService {

	// 调用mybatis里面的查询所有的方法，并实现业务层的接口里面的方法。这里就是查询到的所有值，用于controller层里面，我们将其转换为json字符串。
	public List<UserInfo> findAll() {

		SqlSession sqlSession = MybatisUtil.getSqlSession();
		UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
		List<UserInfo> findAll = mapper.findAll();

		return findAll;
	}

}
