package com.esmt.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.esmt.domaine.Ecole;
import com.esmt.domaine.Etudiant;

public class demoJpa {

	public static void main(String[] args) {
// Ouverture d'une unité de travail jpa
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();

	

//Ouverture d'une transaction
EntityTransaction tx = em.getTransaction();
tx.begin();

// Instanciation des objets
Etudiant e1 = new Etudiant("Hane", "Abdoul aziz");
Etudiant e2 = new Etudiant("kabore", "Eric");
Etudiant e3 = new Etudiant("Nabi", "David");


Ecole ecole = new Ecole("ESMT");
Ecole ecole1 = new Ecole("UCAD");

e1.setEcole(ecole);
e2.setEcole(ecole);
e3.setEcole(ecole1);

//Persistence des objets en base
em.persist(ecole);
em.persist(ecole1);

em.persist(e1);
em.persist(e2);
em.persist(e3); 


//selection des differentes ecoles
Query query = em.createQuery("SELECT DISTINCT ec.nom FROM Etudiant et JOIN et.ecole ec");
List<String> listeNom =query.getResultList();
for(String nom:listeNom)
{
	System.out.println("Nom Ecole: "+nom);
}



//traitement
//Etudiant etrouve =
//em.find(Etudiant.class, 3L);
//System.out.println(etrouve.toString());
//em.remove(etrouve);

//Fermeture
tx.commit();
em.close();
emf.close();


	}

}
