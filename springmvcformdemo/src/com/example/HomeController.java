package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController<String>{

	@RequestMapping
	public String showPage()
	{
		return "main-menu";
	}
}
