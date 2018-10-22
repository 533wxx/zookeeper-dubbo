package com.wxx.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wxx.dubbo.student.server.StudentServer;
//@Controller
//@ResponseBody
@RestController
@RequestMapping("controller")
public class StudentController {
	
	@Reference//
	private StudentServer stuServer ;
	
	@RequestMapping("rpcSerer")
	public String rpcSerer() {
		String result = stuServer.server("zs") ;
		
		return result ;//将结果显示在控制台
		
		
		
	}
}
