package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.KategoriModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.IKategoriRepository;

@Repository
public class KategoriRepository implements IKategoriRepository{

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<KategoriModel> viewAll(KategoriModel model) {
		// TODO Auto-generated method stub
		var sql = "Select * from kategori_skripsi";
		return jdbc.query(sql, new BeanPropertyRowMapper<KategoriModel>(KategoriModel.class));
	}

	@Override
	public int addKategori(KategoriModel model) {
		// TODO Auto-generated method stub
		var query = "Insert into kategori_skripsi(id,kategori)" + "values (?,?)";
		return jdbc.update(query,
				new Object[] { model.getId(), model.getKategori() });
	}

}
