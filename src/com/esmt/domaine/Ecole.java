package com.esmt.domaine;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ecole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nom;


public Ecole() {
	super();
	// TODO Auto-generated constructor stub
}
public Ecole(String nom) {
	super();
	this.nom = nom;
}
public Ecole(Long id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}


}
