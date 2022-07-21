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
	
	@RequestMapping("/home")
	public String Home() {
		String html = "Home";
		return html;
	}
	
	@RequestMapping("/css")
	public String Css() {
		String html = "learn_css";
		return html;
	}
	
	@RequestMapping("/css2")
	public String Css2() {
		String html = "learn_css2";
		return html;
	}
	
	@RequestMapping("/jquery")
	public String Jquery() {
		String html = "learn_jquery";
		return html;
	}
	
	@RequestMapping("/warna")
	public String ubahWarna() {
		String html = "warna";
		return html;
	}
	
	@RequestMapping("/surat")
	public String animasiSurat() {
		String html = "AnimasiSurat";
		return html;
	}
	
	@RequestMapping("/quiz2")
	public String quiz2() {
		String html = "Quiz2";
		return html;
	}
}