package com.briup.apps.poll.dao;

import java.util.List;


import com.briup.apps.poll.bean.Course;

public interface CourseMapper {
	/*
	 * 查询所有课程
	 * */

	List<Course> findAll();
	
	
}
