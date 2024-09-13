package com.algaworks.erp.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.erp.model.Empresa;

public class SchemaGeneration {
	
	public static void main(String[] args) {		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");
		
		EntityManager em = emf.createEntityManager();
		
		List<Empresa> lista = em.createQuery("from Empresa", Empresa.class)
				.getResultList();
		
		lista.forEach(x -> System.out.println(x.getNomeFantasia()));

		
		em.close();
		emf.close();
	}

}