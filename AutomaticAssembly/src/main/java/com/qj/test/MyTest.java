package com.qj.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qj.dao.UserInfoDao;
import com.qj.entity.People;
import com.qj.entity.UserInfo;
import com.qj.utils.MybatisUtil;

public class MyTest {
	@SuppressWarnings("resource")
	@Test
	public void demo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		People people = context.getBean("people", People.class);
//		System.out.println(people);
		people.getCat().jiao();
		people.getDog().jiao();

	}

	@Test
	public void demo2() {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		UserInfoDao mapper = sqlSession.getMapper(UserInfoDao.class);
		List<UserInfo> findAll = mapper.findAll();
		for (UserInfo userInfo : findAll) {
			System.out.println(userInfo);
		}
	}
}
