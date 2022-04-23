package test;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Student;

public class ReadRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// select * from employee
		//HQL/JPQL:object oriented version of sql
		//from student
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		TypedQuery<Student>query = session.createQuery("from Student");
	     List<Student>list=query.getResultList();
	     for(Student s : list){
	    	 System.out.println(s);
	     }
	
	
	
	
	}

}
