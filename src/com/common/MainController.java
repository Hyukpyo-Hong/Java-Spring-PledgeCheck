package com.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/main")
	public ModelAndView main() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("/common/mainCenter");

		return mv;
	}

}
