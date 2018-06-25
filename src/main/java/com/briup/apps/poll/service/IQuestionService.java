package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.question;

public interface IQuestionService {
	List<question> findAll() throws Exception;

}
