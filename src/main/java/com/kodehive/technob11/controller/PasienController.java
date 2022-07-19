package com.kodehive.technob11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rumahsakit")
public class PasienController {
	
	@RequestMapping("/pasien")
	public String view() {
		return "/rumahsakit/DataPasien";
	}
}
