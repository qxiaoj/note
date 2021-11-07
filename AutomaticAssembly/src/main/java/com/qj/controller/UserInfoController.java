package com.qj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qj.entity.UserInfo;
import com.qj.service.UserInfoService;
import com.qj.service.UserInfoServiceImpl;

@SuppressWarnings("serial")
@WebServlet("/findAll")
public class UserInfoController extends HttpServlet {

	UserInfoService userInfoService = new UserInfoServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = "";

		List<UserInfo> userInfo = userInfoService.findAll();

		ObjectMapper objectMapper = new ObjectMapper();
		// 创建一个hashMap来存放查询出来的结果
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("status", 200);
		map.put("userinfo", userInfo);

		try {
			result = objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		try {
			response.getWriter().append(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
