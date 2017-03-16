package com.information.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InformationController {

	
	@RequestMapping(value="/keyPointIndex")
	public ModelAndView keyPointIndex(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/information/keyPointIndex");
		
		return mv;
		
		
	}
}
