package com.mogujie.myapp_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysController {

	@RequestMapping("/getinfoes")
	public Object getinfoes(){
		
		return "hello ...哈哈";
	}
}
