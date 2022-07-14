package com.kodehive.technob11.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PASIEN")
public class PasienModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nomor;
	private String nama;
	private String gender;
	private String kategori;
	private int biaya;
	private Date tanggal;
}
