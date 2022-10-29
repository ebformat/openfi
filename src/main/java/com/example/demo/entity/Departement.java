package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//https://www.youtube.com/watch?v=B21hZgzDTpQ
@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dptID;
	private String nameDpt;
}
