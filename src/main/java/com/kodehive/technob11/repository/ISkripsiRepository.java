package com.kodehive.technob11.repository;

import java.util.List;

import com.kodehive.technob11.model.SkripsiModel;

public interface ISkripsiRepository {
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun);
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata);
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model);
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun);
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf);
}
