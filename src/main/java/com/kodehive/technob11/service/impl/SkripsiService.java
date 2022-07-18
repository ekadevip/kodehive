package com.kodehive.technob11.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.ISkripsiRepository;
import com.kodehive.technob11.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService {

	@Autowired
	ISkripsiRepository skripsiRepository;

	@Override
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		return skripsiRepository.selectByKurangDariTahun(model, tahun);
	}

	@Override
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata) {
		// TODO Auto-generated method stub
		return skripsiRepository.selectByKata(model, kata);
	}

	@Override
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model, int tahun, int nilai) {
		// TODO Auto-generated method stub
		return skripsiRepository.selectByTahunNilai(model, tahun, nilai);
	}

	@Override
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		return skripsiRepository.selectByKecualiTahun(model, tahun);
	}

	@Override
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf) {
		// TODO Auto-generated method stub
		return skripsiRepository.selectByTidakBerawalanHuruf(model, huruf);
	}

	@Override
	public int insert(SkripsiModel model) {
		// TODO Auto-generated method stub
		return skripsiRepository.insert(model);
	}

	@Override
	public List<SkripsiModel> selectAll() {
		// TODO Auto-generated method stub
		return skripsiRepository.selectAll();
	}

	@Override
	public List<SkripsiModel> search(String huruf) {
		// TODO Auto-generated method stub
		return skripsiRepository.search(huruf);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return skripsiRepository.deleteById(id);
	}

	@Override
	public int deleteByIdUrl(int id) {
		// TODO Auto-generated method stub
		return skripsiRepository.deleteByIdUrl(id);
	}

	@Override
	public int editById(SkripsiModel model, int id) {
		// TODO Auto-generated method stub
		return skripsiRepository.editById(model, id);
	}

}
