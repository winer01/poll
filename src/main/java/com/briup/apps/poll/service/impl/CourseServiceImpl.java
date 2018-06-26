package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.dao.CourseMapper;
import com.briup.apps.poll.service.ICourseService;

@Service
	public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	/*@Override是伪代码，所以是可写可不写的．它表示方法重写，写上会给我们带来好处．
　　　1．可以当注释用,方便阅读．
　　　2．告诉阅读你代码的人，这是方法的复写．
　　　3．编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错*/
	public List<Course> findAll() throws Exception {
		
		return courseMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception {
		courseMapper.deleteById(id);
	
	
	}

	@Override
	public void save(Course course) throws Exception {
		courseMapper.save(course);
	}
	
	/*@Override
	public void update(Course course) throws Exception{
		courseMapper.update(course);
	}
*/
}