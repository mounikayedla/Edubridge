package com.example.mavenTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	p.setP_id(10);
    	p.setName("Mounika");
    	p.setTech("ENG");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pr");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(p);
    	em.getTransaction().commit();
        System.out.println(p );
    }
}
