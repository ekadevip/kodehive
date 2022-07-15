package com.kodehive.technob11.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.service.ISkripsiService;

@Controller
@RequestMapping("/skripsi")
public class SkripsiController {

	@Autowired
	ISkripsiService SkripsiService;

	@RequestMapping("/view1/{tahun}")
	@ResponseBody
	public List<SkripsiModel> selectSkripsi1(SkripsiModel model, @PathVariable String tahun) {
		return SkripsiService.selectByKurangDariTahun(model, Integer.valueOf(tahun));
	}
	
	@RequestMapping("/view2/{kata}")
	@ResponseBody
	public List<SkripsiModel> selectSkripsi2(SkripsiModel model, @PathVariable String kata) {
		return SkripsiService.selectByKata(model, kata);
	}
	
	@RequestMapping("/view3/{tahun}/{nilai}")
	@ResponseBody
	public List<SkripsiModel> selectSkripsi3(SkripsiModel model, @PathVariable String tahun, @PathVariable String nilai) {
		return SkripsiService.selectByTahunNilai(model, Integer.valueOf(tahun), Integer.valueOf(nilai));
	}
	
	@RequestMapping("/view4/{tahun}")
	@ResponseBody
	public List<SkripsiModel> selectSkripsi4(SkripsiModel model, @PathVariable String tahun) {
		return SkripsiService.selectByKecualiTahun(model, Integer.valueOf(tahun));
	}
	
	@RequestMapping("/view5/{huruf}")
	@ResponseBody
	public List<SkripsiModel> selectSkripsi5(SkripsiModel model, @PathVariable String huruf) {
		return SkripsiService.selectByTidakBerawalanHuruf(model, huruf);
	}

}
