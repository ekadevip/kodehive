package com.kodehive.technob11.repository;

import java.util.List;

import com.kodehive.technob11.model.KategoriModel;

public interface IKategoriRepository {
	public List<KategoriModel> viewAll(KategoriModel model);
	public int addKategori(KategoriModel model);
}
