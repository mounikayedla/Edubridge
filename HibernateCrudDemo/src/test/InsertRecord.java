package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Student;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student();
s.setSname("Navya");
s.setRollNo(14);
s.setCourse("embedded");
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session =sessionFactory.openSession();
	session.beginTransaction();
	session.save(s);
	session.getTransaction().commit();
	
	session.close();
	
	}

}
