package com.kodehive.technob11.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {

	JdbcTemplate jdbc;

	@Override
	public int insert(MahasiswaModel model) {
		// TODO Auto-generated method stub
		var query = "Insert into t_mahasiswa(name, gender, alamat,spp)"
				+ "values(?,?,?,?)";
		return jdbc.update(query,
				new Object[] {model.getName(), model.getGender(), model.getAlamat(), model.getSpp()});
	}

}
