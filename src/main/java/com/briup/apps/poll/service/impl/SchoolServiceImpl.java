package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.school;
import com.briup.apps.poll.dao.QuestionMapper;
import com.briup.apps.poll.dao.SchoolMapper;
import com.briup.apps.poll.service.ISchoolService;
@Service
public class SchoolServiceImpl implements ISchoolService{
	@Autowired
	private SchoolMapper schoolMapper;
	@Override
	public List<school>findAll() throws Exception{
		return schoolMapper.findAll();
	}
	
	
	

}
