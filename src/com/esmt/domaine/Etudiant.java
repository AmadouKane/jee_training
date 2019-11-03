package com.esmt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nom;
private String prenom;
@ManyToOne
private Ecole ecole;

public Etudiant() {
	super();
	// TODO Auto-generated constructor stub
}
public Etudiant(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public Etudiant(Long id, String nom, String prenom) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
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
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Ecole getEcole() {
	return ecole;
}
public void setEcole(Ecole ecole) {
	this.ecole = ecole;
}
@Override
public String toString() {
	return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
}

}
