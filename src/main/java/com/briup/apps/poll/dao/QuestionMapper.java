package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.question;

public interface QuestionMapper {
	List<question>findAll();
	void deleteById(long id);

}
