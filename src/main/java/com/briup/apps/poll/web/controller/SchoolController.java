package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.school;
import com.briup.apps.poll.service.ISchoolService;
@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private ISchoolService schoolService;
	@GetMapping("findAllschool")
	public List<school> findAllschool(){
		List<school> list=new ArrayList<>();
		try{
			list=schoolService.findAll();
		} catch (Exception e){
			e.printStackTrace();
		}
		return list;
		}

		
	}
	

