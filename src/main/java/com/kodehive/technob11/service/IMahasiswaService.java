package com.kodehive.technob11.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.MahasiswaModel;

@Service
public interface IMahasiswaService {
	public int insert(MahasiswaModel model);
	public int edit(MahasiswaModel model, int id);
	public List<MahasiswaModel> viewMahasiswaSkripsi(MahasiswaModel model);
	public List<MahasiswaModel> viewMahasiswaSkripsiByKategori(MahasiswaModel model, String kategori);
	public List<MahasiswaModel> viewAll(MahasiswaModel model);
	public int addMahasiswa(MahasiswaModel model);
	public List<MahasiswaModel> readAll();
}
