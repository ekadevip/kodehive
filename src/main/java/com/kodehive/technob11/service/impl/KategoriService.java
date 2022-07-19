package com.kodehive.technob11.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.KategoriModel;
import com.kodehive.technob11.repository.IKategoriRepository;
import com.kodehive.technob11.service.IKategoriService;

@Repository
public class KategoriService implements IKategoriService {

	@Autowired
	IKategoriRepository kategoriRepository;
	
	@Override
	public List<KategoriModel> viewAll(KategoriModel model) {
		// TODO Auto-generated method stub
		return kategoriRepository.viewAll(model);
	}

	@Override
	public int addKategori(KategoriModel model) {
		// TODO Auto-generated method stub
		return 0;
	}

}
