package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {
  
	public static void main(String[] args) {
		 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Parent parent = new Parent();
		parent.setId(1);
		parent.setName("Deepu");
		parent.setEmail("deepu@gmail.com");
		parent.setPhone(123456789);
		
		entityTransaction.begin();
		entityManager.merge(parent);
		entityTransaction.commit();
		
	}
}
