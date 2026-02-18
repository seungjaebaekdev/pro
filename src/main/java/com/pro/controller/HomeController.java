package com.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		log.info("세팅 성공");
		
		// 화면에 데이터 보내기
		model.addAttribute("message", "프로젝트 세팅 성공");
		
		// /WEB-INF/views/home.jsp 를 찾아
		return "home";
	}
}
