package com.kodehive.technob11.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kodehive.technob11.model.SkripsiModel;

public class SkripsiRowMapper implements RowMapper<SkripsiModel>{

	@Override
	public SkripsiModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SkripsiModel skripsi = new SkripsiModel();

        skripsi.setId(rs.getInt("ID"));
        skripsi.setJudul(rs.getString("JUDUL"));
        skripsi.setNilai(rs.getInt("NILAI"));
        skripsi.setTahun(rs.getInt("TAHUN"));
        
        return skripsi;
	}

}
