package fvs.edu.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fvs.edu.dominio.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("topicos-fvs");
		EntityManager em = emf.createEntityManager();
		
		
		Aluno aluno = em.find(Aluno.class, 3);
		System.out.println(aluno);
		
		//em.getTransaction().begin();
		//Aluno aluno = new Aluno(null, "Karlos Oliveira", "035.919.683-74", "132421312", 9131);
		//em.persist(aluno);
		//em.getTransaction().commit();
		
		System.out.println("Salvo com sucesso!");
		

	}

}
