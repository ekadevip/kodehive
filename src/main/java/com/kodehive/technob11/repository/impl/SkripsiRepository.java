package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository{

	JdbcTemplate jdbc;

	@Override
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun "+"<="+tahun;
		return jdbc.query(sql, new BeanPropertyRowMapper <SkripsiModel>());
	}

	@Override
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul like '%"+kata+"%'";
		return jdbc.query(sql, new BeanPropertyRowMapper <SkripsiModel>());
	}

	@Override
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model, int tahun, int nilai) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun ? and nilai ?";
		return jdbc.query(sql, new BeanPropertyRowMapper <SkripsiModel>(),tahun,nilai);
	}
	
	@Override
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun not like "+tahun+" order by desc";
		return jdbc.query(sql, new BeanPropertyRowMapper <SkripsiModel>());
	}

	@Override
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul not like '"+huruf+"%'";
		return jdbc.query(sql, new BeanPropertyRowMapper <SkripsiModel>());
	}

}
