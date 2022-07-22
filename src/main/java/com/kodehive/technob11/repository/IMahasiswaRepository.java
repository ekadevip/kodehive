package com.kodehive.technob11.repository;

import java.util.List;

import com.kodehive.technob11.model.MahasiswaModel;

public interface IMahasiswaRepository {
	
	public int insert(MahasiswaModel model);
	public int add(MahasiswaModel Model);
	public int edit(MahasiswaModel Model, int id);
	public List<MahasiswaModel> viewAll(MahasiswaModel model);
	public List<MahasiswaModel> viewMahasiswaSkripsi(MahasiswaModel model);
	public List<MahasiswaModel> viewMahasiswaSkripsiByKategori(MahasiswaModel model, String kategori);
	public List<MahasiswaModel> readAll();
}
