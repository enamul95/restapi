package com.rest.restapi.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.restapi.model.HellowWorldBean;

@RestController
public class HellowWorldController {
	
	@GetMapping("/hellow-world")
	public String hellowWorld( @Param("name") String name) {
		return "Hellow world "+name;
	}

	@GetMapping("/hellow-world-bean")	
	public HellowWorldBean hellowWorldBend(@Param("name") String name) {
		HellowWorldBean hellowWorldBean = new HellowWorldBean();
		hellowWorldBean.setName(name);
		hellowWorldBean.setPhone("+88019000000");
		hellowWorldBean.setAddress("Shaital Amani Bari");
		
		return hellowWorldBean;
	}

	
	@GetMapping(path = "/hellow-world-bean/path-variable/{name}")	
	public HellowWorldBean hellowWorldPathVarialble(@PathVariable String name) {
		HellowWorldBean hellowWorldBean = new HellowWorldBean();
		hellowWorldBean.setName(name);
		hellowWorldBean.setPhone("+88019000000");
		hellowWorldBean.setAddress("Shaital Amani Bari path variable");
		
		return hellowWorldBean;
	}

}
