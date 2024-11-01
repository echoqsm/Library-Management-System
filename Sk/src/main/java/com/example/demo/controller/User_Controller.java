package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.mapper.User_Mapper;

@Controller

public class User_Controller {
	@Autowired
	User_Mapper mapper;
	
	@RequestMapping("/User")
	public String index(Model m){
		 m.addAttribute("list",mapper.select());
		 return "index";   //直接到templates目录，自动加入后缀.html,根据路径查找模板文件,处理模板数据渲染
	}
	
	
}
