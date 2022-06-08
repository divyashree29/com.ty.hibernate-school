package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
    
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Visitor v = new Visitor();
		v.setId(3);
		v.setName("Divya");
        v.setEmail("div@gmail.com");
        v.setDob(LocalDate.of(1997, 01, 9));
        v.setVisitDateTime(LocalDateTime.now());
        v.setGender("female");
        
        entityTransaction.begin();
		
		entityManager.persist(v);
		
		entityTransaction.commit();
		
		System.out.println("---------Done-----------");
        
        
	}
}
