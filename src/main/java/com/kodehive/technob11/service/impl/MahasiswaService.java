package com.kodehive.technob11.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;
import com.kodehive.technob11.service.IMahasiswaService;

@Service
//controller->service->repository
public class MahasiswaService implements IMahasiswaService {
	@Autowired
	IMahasiswaRepository MahasiswaRepository;

	@Override
	public int insert(MahasiswaModel model) {
		// TODO Auto-generated method stub
		MahasiswaRepository.insert(model);
		return 0;
	}
}
