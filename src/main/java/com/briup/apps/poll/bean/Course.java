package com.briup.apps.poll.bean;

import java.io.Serializable;

/*
 * pojo类是java最简单的类，这种类也被称为是模型类，用于对应的
 * 1，私有的属性
 * 2，公共的getter方法和setter方法
 * 3，属性的数据类型应该是应用数据类型
 * 4，实现序列化接口
 * */
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private Long id;
	private String name;
	private String description;
	private Integer period;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}

}
