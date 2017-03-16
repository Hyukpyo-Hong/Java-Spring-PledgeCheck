package com.calendar.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalendarDao implements ICalendarDao{
	
	@Autowired
	SqlSessionTemplate sm;
	
	//sql 임시 테스트용
	@Override
	public String getTemp() {
		return sm.selectOne("Pledge.getTemp");
	}

}
