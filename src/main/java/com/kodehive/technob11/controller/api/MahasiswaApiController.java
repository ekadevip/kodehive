package com.kodehive.technob11.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.service.impl.MahasiswaService;

@RestController
@RequestMapping("/api")
public class MahasiswaApiController {

	@Autowired
	MahasiswaService mahasiswaService;
	
	@PostMapping("/insert")
	public String insertMahasiswa(@RequestBody MahasiswaModel mahasiswaModel) {
		mahasiswaService.insert(mahasiswaModel);
		return "insert success";
	}
}
