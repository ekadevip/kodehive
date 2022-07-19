package com.kodehive.technob11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.service.ISkripsiService;

@Controller
@RequestMapping("/skripsi")//bisa digunakan untuk class ataupun method
public class SkripsiController {

	@Autowired //berkaitan dengan dependencies injection
	ISkripsiService SkripsiService;

	@GetMapping("/viewAllSkripsi")
	@ResponseBody
	public List<SkripsiModel> viewAll(SkripsiModel model) {
		return SkripsiService.selectAll();
	}
	
	
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
	
	@PostMapping("/insert")//post,put/get/delete hanya bisa digunakan di method saja
	@ResponseBody
	public String insert(@RequestBody SkripsiModel model) {
		SkripsiService.insert(model);
		return "Insert Success..";
	}
	
	@PutMapping("/edit")
	@ResponseBody
	public String editById(@RequestBody SkripsiModel model, @RequestParam int id) {
		return "Skripsi update success.."+SkripsiService.editById(model,id);
	}
	
	@RequestMapping("/viewAll")
	@ResponseBody
	public List<SkripsiModel> selectAll(){
		return SkripsiService.selectAll();
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public List<SkripsiModel> search(@RequestParam String keyword){
		return SkripsiService.search(keyword);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public int deleteById(@RequestParam int id) {
		return SkripsiService.deleteById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public int deleteByIdUrl(@PathVariable int id) {
		return SkripsiService.deleteById(id);
	}
	
	@RequestMapping("/viewMahasiswaSkripsiByKategori")
	@ResponseBody
	public <T> List<T> search(SkripsiModel model, @RequestParam String kategori){
		return SkripsiService.selectByKategori(model, kategori);
	}
	
}
