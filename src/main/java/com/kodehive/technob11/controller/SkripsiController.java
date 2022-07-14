package com.kodehive.technob11.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.service.ISkripsiService;

@Controller
public class SkripsiController {

	@Autowired
	ISkripsiService SkripsiService;

	@RequestMapping("/view1")
	public String selectSkripsi1(SkripsiModel model) {
		SkripsiService.selectByKurangDariTahun(model, 2019);
		return "Success..";
	}
	@RequestMapping("/view2")
	public String selectSkripsi2(SkripsiModel model) {
		SkripsiService.selectByKata(model, "Aplikasi");
		return "Success..";
	}
	@RequestMapping("/view3")
	public String selectSkripsi3(SkripsiModel model) {
		SkripsiService.selectByTahunNilai(model, 2019, 80);
		return "Success..";
	}
	@RequestMapping("/view4")
	public String selectSkripsi4(SkripsiModel model) {
		SkripsiService.selectByKecualiTahun(model, 2018);
		return "Success..";
	}
	@RequestMapping("/view5")
	public String selectSkripsi5(SkripsiModel model) {
		SkripsiService.selectByTidakBerawalanHuruf(model, "A");
		return "Success..";
	}

}
