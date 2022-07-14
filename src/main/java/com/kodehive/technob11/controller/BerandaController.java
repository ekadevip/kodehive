package com.kodehive.technob11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class BerandaController {
	@RequestMapping("/beranda")
	public String Beranda() {
		String html = "Beranda";
		return html;
	}
}