package com.MySNS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@RequestMapping("/login")
	public ModelAndView toPage2(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
	
        return mav;
	}
	
	@RequestMapping("/test")
	public ModelAndView toPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
	
        return mav;
	}
}
