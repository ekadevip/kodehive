package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int add(MahasiswaModel model) {
		// TODO Auto-generated method stub
		var query = "Insert into mahasiswa(id, nama, jurusan)"
				+ "values(?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getId(), model.getNama(), model.getJurusan()});
	}

	@Override
	public List<MahasiswaModel> viewAll(MahasiswaModel model) {
		// TODO Auto-generated method stub
		var sql = "Select * from mahasiswa";
		return jdbc.query(sql, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public int insert(MahasiswaModel model) {
		// TODO Auto-generated method stub
		var query = "Insert into mahasiswa(id, nama, jurusan)"
				+ "values(?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getId(), model.getNama(), model.getJurusan()});
	}

	@Override
	public List<MahasiswaModel> viewMahasiswaSkripsi(MahasiswaModel model) {
		// TODO Auto-generated method stub
		var sql ="select m.id,m.nama,m.jurusan from mahasiswa m\r\n"
				+ "join skripsi s on m.id=s.mahasiswa_id";
		return jdbc.query(sql, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public List<MahasiswaModel> viewMahasiswaSkripsiByKategori(MahasiswaModel model, String kategori) {
		// TODO Auto-generated method stub
		var sql ="select m.id,m.nama,m.jurusan,s.judul from mahasiswa m\r\n"
				+ "join skripsi s on m.id=s.mahasiswa_id \r\n"
				+ "join kategori_skripsi k on s.kategori_id=k.id\r\n"
				+ "where k.kategori like '%"+kategori+"%';";
		return jdbc.query(sql, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public int edit(MahasiswaModel model,int id) {
		// TODO Auto-generated method stub
		var sql = "update mahasiswa set nama=? where id =?";
		return jdbc.update(sql,
				new Object[] { model.getNama(), id});
	}

	@Override
	public List<MahasiswaModel> readAll() {
		// TODO Auto-generated method stub
		var sql = "Select * from mahasiswa";
		return jdbc.query(sql, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

}
