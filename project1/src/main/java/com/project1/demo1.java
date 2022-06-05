package com.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo1 {
	@RequestMapping("/demo1")
	public String demo() {
		return "demo-1";
	}
	
}

