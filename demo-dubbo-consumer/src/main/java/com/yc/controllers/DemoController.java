package com.yc.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yc.biz.DemoBiz;

@Controller
public class DemoController {
	
	@Resource(name="demoBiz")
	private DemoBiz demoBiz;
	
	@RequestMapping("back/test.action")
	public @ResponseBody String sayHello(){
		String str=demoBiz.getDemo();
		System.out.println("控制层打印"+str);
		Gson gson=new Gson();
		
		return gson.toJson(str);
	}
}
