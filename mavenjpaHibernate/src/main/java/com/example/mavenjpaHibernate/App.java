package com.example.mavenjpaHibernate;

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
    	Person1 p=new Person1();
    	p.setP_id(10);
    	p.setName("Mounika");
    	p.setTech("ENG");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(p);
    	em.getTransaction().commit();
        System.out.println(p );
    }
}
