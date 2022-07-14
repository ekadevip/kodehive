package com.kodehive.technob11.service;

import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.MahasiswaModel;

@Service
public interface IMahasiswaService {
	public int insert(MahasiswaModel model);
}
