package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.model.SkripsiModel;
import com.kodehive.technob11.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insert(SkripsiModel model) {
		// TODO Auto-generated method stub
		var query = "Insert into skripsi(judul, nilai, tahun, kategori_id, mahasiswa_id)" + "values (?,?,?,?,?)";
		return jdbc.update(query,
				new Object[] { model.getJudul(), model.getNilai(), model.getTahun(), model.getKategori_id(), model.getMahasiswa_id() });
	}
	
	@Override
	public List<SkripsiModel> selectAll() {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}
	
	@Override
	public List<SkripsiModel> selectByKurangDariTahun(SkripsiModel model, int tahun) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where tahun <=?";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun);
	}

	@Override
	public List<SkripsiModel> selectByKata(SkripsiModel model, String kata) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul like '%" + kata + "%'";
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
		var sql = "Select * from skripsi where judul like '" + huruf + "%' order by tahun desc";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}
	
	@Override
	public List<SkripsiModel> search(String huruf) {
		// TODO Auto-generated method stub
		var sql = "Select * from skripsi where judul like '" + huruf + "%' order by tahun desc";
		return jdbc.query(sql, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		var sql = "Delete from skripsi where id=?";
		return jdbc.update(sql,id);
	}

	@Override
	public int deleteByIdUrl(int id) {
		// TODO Auto-generated method stub
		var sql = "Delete from skripsi where id=?";
		return jdbc.update(sql,id);
	}

	@Override
	public int editById(SkripsiModel model, int id) {
		// TODO Auto-generated method stub
		var sql = "update skripsi set judul =?, nilai=?, tahun=? where id =?";
		return jdbc.update(sql,
				new Object[] { model.getJudul(), model.getNilai(), model.getTahun(),id});
	}

	@Override
	public List<SkripsiModel> selectByKategori(SkripsiModel model1, String kategori) {
		// TODO Auto-generated method stub
		var sql = "select s.id,s.judul, s.nilai, s.tahun,s.kategori_id,s.mahasiswa_id from mahasiswa m\r\n"
				+ "right join skripsi s on m.id=s.mahasiswa_id \r\n"
				+ "join kategori_skripsi k on s.kategori_id=k.id\r\n"
				+ "where k.kategori like '%"+kategori+"%'";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(SkripsiModel.class));
	}

	

}
