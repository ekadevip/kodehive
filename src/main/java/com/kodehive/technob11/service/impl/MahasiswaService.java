package com.kodehive.technob11.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;
import com.kodehive.technob11.service.IMahasiswaService;

@Service
//controller->service->repository
public class MahasiswaService implements IMahasiswaService {
	
	@Autowired
	IMahasiswaRepository mahasiswaRepository;

	@Override
	public int addMahasiswa(MahasiswaModel model) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.add(model);
	}

	@Override
	public List<MahasiswaModel> viewAll(MahasiswaModel model) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.viewAll(model);
	}

	@Override
	public int insert(MahasiswaModel model) {
		// TODO Auto-generated method stub
		mahasiswaRepository.insert(model);
		return 0;
	}

	@Override
	public List<MahasiswaModel> viewMahasiswaSkripsi(MahasiswaModel model) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.viewMahasiswaSkripsi(model);
	}

	@Override
	public List<MahasiswaModel> viewMahasiswaSkripsiByKategori(MahasiswaModel model, String kategori) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.viewMahasiswaSkripsiByKategori(model, kategori);
	}

	@Override
	public int edit(MahasiswaModel model, int id) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.edit(model, id);
	}

	@Override
	public List<MahasiswaModel> readAll() {
		// TODO Auto-generated method stub
		return mahasiswaRepository.readAll();
	}
}
