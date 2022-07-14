package com.kodehive.technob11.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.impl.SkripsiRepository;
import com.kodehive.technob11.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService {

	SkripsiRepository skripsiRepository;

	@Override
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		List<SkripsiModel> result = new ArrayList<SkripsiModel>();
		result = skripsiRepository.selectByKurangDariTahun(model, tahun);
		return result;
	}

	@Override
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata) {
		// TODO Auto-generated method stub
		List<SkripsiModel> result = new ArrayList<SkripsiModel>();
		result = skripsiRepository.selectByKata(model, kata);
		return result;
	}

	@Override
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model, int tahun, int nilai) {
		// TODO Auto-generated method stub
		List<SkripsiModel> result = new ArrayList<SkripsiModel>();
		result = skripsiRepository.selectByTahunNilai(model, tahun, nilai);
		return result;
	}

	@Override
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		List<SkripsiModel> result = new ArrayList<SkripsiModel>();
		result = skripsiRepository.selectByKecualiTahun(model, tahun);
		return result;
	}

	@Override
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf) {
		// TODO Auto-generated method stub
		List<SkripsiModel> result = new ArrayList<SkripsiModel>();
		result = skripsiRepository.selectByTidakBerawalanHuruf(model, huruf);
		return result;
	}

}
