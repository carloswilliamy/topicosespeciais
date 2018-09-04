package fvs.edu.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fvs.edu.dominio.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("topicos-fvs");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Aluno aluno = new Aluno(null, "Carlos Williamy", "072.290.823-74", "arrozfeijao", 9558);
		em.persist(aluno);
		em.getTransaction().commit();
		System.out.println("Salvo com sucesso!");
		

	}

}
