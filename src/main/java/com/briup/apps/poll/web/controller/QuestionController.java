package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.apps.poll.bean.question;
import com.briup.apps.poll.service.IQuestionService;
@Controller
@RequestMapping("/question")
public class QuestionController {
	
		@Autowired
		private IQuestionService questionService;
		@GetMapping("findAllquestion")
		public List<question>findAllquestion(){
			List<question>list=new ArrayList<>();
			try{
			    list=questionService.findAll();
			}catch (Exception e){
				e.printStackTrace();
			}
			return list;
		}
}
