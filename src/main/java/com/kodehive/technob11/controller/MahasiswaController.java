package com.kodehive.technob11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller digunakan untuk mengatur url yang akan dijalankan pada browser
@Controller
public class MahasiswaController {

	@RequestMapping("/kodehive/karyawan")
	public String ViewKaryawan() {
		return "/company/divisi/Karyawan";
	}

	@RequestMapping("/kodehive/mahasiswa")
	public String ViewMahasiswa() {
		return "/kampus/kelas/Mahasiswa";
	}
}
