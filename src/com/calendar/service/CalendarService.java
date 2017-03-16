package com.calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calendar.dao.ICalendarDao;

@Service
public class CalendarService implements ICalendarService {

	@Autowired
	ICalendarDao calendarDao;
	
	//sql 임시 테스트용
	@Override
	public String getTemp() {
		return calendarDao.getTemp();
	}

}
