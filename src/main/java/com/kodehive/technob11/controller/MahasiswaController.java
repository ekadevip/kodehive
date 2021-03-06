package com.kodehive.technob11.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.engine.AttributeName;

import com.kodehive.technob11.model.KategoriModel;
import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;
import com.kodehive.technob11.service.IKategoriService;
import com.kodehive.technob11.service.IMahasiswaService;

//controller digunakan untuk mengatur url yang akan dijalankan pada browser
@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

	@Autowired
	IMahasiswaService mahasiswaService;

	@GetMapping("/viewMahasiswa")
	@ResponseBody
	public List<MahasiswaModel> viewMahasiswa(MahasiswaModel model) {
		return mahasiswaService.viewAll(model);
	}

	@GetMapping("/viewMahasiswaSkripsi")
	@ResponseBody
	public List<MahasiswaModel> viewMahasiswaSkripsi(MahasiswaModel model) {
		return mahasiswaService.viewMahasiswaSkripsi(model);
	}

	@RequestMapping("/viewMahasiswaSkripsiByKategori")
	@ResponseBody
	public List<MahasiswaModel> search(MahasiswaModel model, @RequestParam String kategori) {
		return mahasiswaService.viewMahasiswaSkripsiByKategori(model, kategori);
	}

	@PutMapping("/editMahasiswaNama")
	@ResponseBody
	public int editMahasiswaNama(@RequestBody MahasiswaModel model, @RequestParam int id) {
		return mahasiswaService.edit(model, id);
	}

	@RequestMapping("/list")
	public String mahasiswaList(Model model) {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.readAll();
		model.addAttribute("mahasiswa", mahasiswaModelList);
		return "/mahasiswa/list";
	}

	@RequestMapping("/home")
	public String mahasiswa() {
		return "/mahasiswa/home";
	}
	
	@RequestMapping("/addMhs")
	public String AddMahasiswaModal() {
		return "/mahasiswa/add";
	}
}
