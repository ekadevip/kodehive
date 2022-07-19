package com.kodehive.technob11.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.model.SkripsiModel;

@Service
public interface ISkripsiService {
	public int insert(SkripsiModel model);
	public List<SkripsiModel> selectAll();
	public <T> List<T> selectByKategori(SkripsiModel model, String kategori);
	public List<SkripsiModel> search(String huruf);
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun);
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata);
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model, int tahun, int nilai);
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun);
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf);
	public int deleteById(int id);
	public int deleteByIdUrl(int id);
	public int editById(SkripsiModel model, int id);
}
