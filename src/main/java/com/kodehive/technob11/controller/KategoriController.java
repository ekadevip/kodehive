package com.kodehive.technob11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.technob11.model.KategoriModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.service.IKategoriService;

@Controller
@RequestMapping("/kategori")
public class KategoriController {

	@Autowired
	IKategoriService kategoriService;
	
	@GetMapping("/viewKategori")
	@ResponseBody
	public List<KategoriModel> viewKategori(KategoriModel model) {
		return kategoriService.viewAll(model);
	}
	
}
