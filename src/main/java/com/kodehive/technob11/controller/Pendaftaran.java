package com.kodehive.technob11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/akun")
public class Pendaftaran {
	@RequestMapping("/daftar")
	public String view() {
		return "/Pendaftaran";
	}
}
