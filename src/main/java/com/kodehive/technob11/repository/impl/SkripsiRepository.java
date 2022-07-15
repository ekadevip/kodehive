package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun <=?";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun);
	}

	@Override
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul like '%"+kata+"%'";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public List<SkripsiModel> selectByTahunNilai(SkripsiModel model, int tahun, int nilai) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun = ? and nilai = ?";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun, nilai);
	}

	@Override
	public List<SkripsiModel> selectByKecualiTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun != ?";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun);
	}

	@Override
	public List<SkripsiModel> selectByTidakBerawalanHuruf(SkripsiModel model, String huruf) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul like '"+huruf+"%' order by tahun desc";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

}
