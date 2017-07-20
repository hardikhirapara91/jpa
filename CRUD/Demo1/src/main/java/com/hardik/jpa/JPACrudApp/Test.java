package com.hardik.jpa.JPACrudApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hardik.jpa.bean.Employee;

/**
 * Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Test {

	public static void main(String[] args) {

		/* Create Entity Manager Factory */
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPACRUD");

		/* Create Entity */
		Employee employee = new Employee();
		employee.setEmpid(7);
		employee.setFirstname("Hardik");
		employee.setLastname("Hirapara");
		employee.setEmail("hardik@hirapara.com");

		/* Create Entity Manager */
		EntityManager manager = factory.createEntityManager();

		/* Persist Entity */
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();

		/* Retrieve Entity */
		employee = manager.find(Employee.class, 3);
		System.out.println(employee);

		/* Update Entity */
		manager.getTransaction().begin();
		employee.setFirstname("Devin");
		manager.getTransaction().commit();

		/* Remove Entity */
		manager.getTransaction().begin();
		manager.remove(employee);
		manager.getTransaction().commit();

		/* Check whether enittiy is removed or not */
		employee = manager.find(Employee.class, 2);
		System.out.println("Employee after removal :- " + employee);
	}
}
