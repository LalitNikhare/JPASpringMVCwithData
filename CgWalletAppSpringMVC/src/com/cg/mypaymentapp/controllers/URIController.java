package com.cg.mypaymentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class URIController {
	@RequestMapping(value="/")
	public String getIndexPage()
	{
		return "index";
	}
}
