package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conindex")
public class ConIndex {
	
	/*@Resource(name="indexTest")
	private IndexTest indexTest;*/
	
	@RequestMapping("/index")
	public String init(HttpServletRequest request, HttpServletResponse response,ModelMap model){
		model.addAttribute("indexs", "hello");
		return "aaa/index.ftl";
	}
}
