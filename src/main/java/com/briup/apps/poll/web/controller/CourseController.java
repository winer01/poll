package com.briup.apps.poll.web.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;

@RestController//服务
@RequestMapping("/course")//接受以“”开头的内容,路由地址
public class CourseController {
	@Autowired//注入进来对应的接口
	private ICourseService courseService;
	@GetMapping("findAllCourse")
	public List<Course> findAllCourse(){
		List<Course> list=new ArrayList<>();
		try{
			list=courseService.findAll();
		} catch (Exception e){
			e.printStackTrace();
		}
		return list;
		}
	
	@GetMapping("deleteCourseById")
	public String deleteCourseById(@RequestParam long id){
		try{
			courseService.deleteById(id);
			return "删除成功！";
		}catch (Exception e){
			return "删除失败"+e.getMessage();
		}
		
	}
	
	@PostMapping("saveCourse")
	public String save(Course course){
		try{
		courseService.save(course);
		return "保存成功";
		}catch (Exception e){
		e.printStackTrace();
		return "保存失败"+e.getMessage();
		}
		
	}
	
	
	
}

