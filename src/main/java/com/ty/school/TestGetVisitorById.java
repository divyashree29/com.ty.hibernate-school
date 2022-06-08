package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Visitor visitor = entityManager.find(Visitor.class, 1);
		if(visitor!= null) {
		System.out.println("Id is "+visitor.getId());
		System.out.println("Name is "+visitor.getName());
		System.out.println("Email is"+visitor.getEmail());
		System.out.println("Dob is "+visitor.getDob());
		System.out.println("VisitedDateTime is "+visitor.getVisitDateTime());
		System.out.println("Gender is "+visitor.getGender());
		
	}else {
		System.out.println("no visitor exist for given id");
	}
}

}


