package com.MySNS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@RequestMapping("/test")
	public ModelAndView toPage(){
		System.out.println("123123123");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
	
        return mav;
	}
}
