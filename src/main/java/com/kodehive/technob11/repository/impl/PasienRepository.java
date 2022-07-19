package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.PasienModel;
import com.kodehive.technob11.repository.IPasienRepository;

@Repository
public class PasienRepository implements IPasienRepository {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<PasienModel> viewAll() {
		// TODO Auto-generated method stub
		var sql = "";
		return null;
	}

}
