package com.qj.entity;

import javax.annotation.Resource;

import lombok.Data;

@Data
public class People {

	/*
	 * @Autowired private Cat cat;
	 * 
	 * @Autowired
	 * 
	 * @Qualifier(value = "dog111")
	 */
	@Resource
	private Cat cat;
	@Resource(name = "dog111")
	private Dog dog;
	private String name;

}