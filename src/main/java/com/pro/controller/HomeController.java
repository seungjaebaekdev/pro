package com.pro.controller;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value ="/", method= RequestMethod.GET)
	public String home(Model model) {
		log.info("세팅 성공");
		
		// 화면에 데이터 보내기
		model.addAttribute("serviceTime", new java.util.Date());
		model.addAttribute("message", "프로젝트 세팅 성공");
		
		// /WEB-INF/views/home.jsp 를 찾아
		return "home";
	}
}
