package com.kodehive.technob11.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.impl.SkripsiRepository;
import com.kodehive.technob11.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService {

	@Autowired
	SkripsiRepository skripsiRepository;

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

}
