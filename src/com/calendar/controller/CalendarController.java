package com.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.calendar.service.ICalendarService;

@Controller
public class CalendarController {

	@Autowired
	ICalendarService calendarService;
	
	@RequestMapping(value="/calendar")
	public ModelAndView calendarMain(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("temp",calendarService.getTemp());
		mv.setViewName("/calendar/calendarMain");
		
		return mv;
	}
	
}
