package com.kodehive.technob11.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kodehive.technob11.repository.ISkripsiRepository;

import lombok.Data;

@Data
@Entity
@Table(name="SKRIPSI")
public class SkripsiModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String judul;
	int nilai;
	int tahun;
}
