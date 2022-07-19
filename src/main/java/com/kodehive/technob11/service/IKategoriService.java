package com.kodehive.technob11.service;

import java.util.List;

import com.kodehive.technob11.model.KategoriModel;

public interface IKategoriService {
	public List<KategoriModel> viewAll(KategoriModel model);
	public int addKategori(KategoriModel model);
}
