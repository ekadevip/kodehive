package com.kodehive.technob11.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//memanfaatkan fitur dari spring yaitu ORM terdapat Spring Data JPA, JDBC Template(fitur semi auto dengan ROW MAPPER)
//dapat melakukan pemetaan dari object sehingga bisa diterima oleh database

@Data //dari projectlombok.org sudah terisi getter, setter, dll
@Entity // class MahasiswaModel adalah entity
@Table(name = "T_MAHASISWA") // menentukan nama table sendiri
public class MahasiswaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int spp;
	private String alamat;
}
