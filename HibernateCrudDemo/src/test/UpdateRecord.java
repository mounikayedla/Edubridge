package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Student;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		Student student=session.get(Student.class, 6);
	
	student.setCourse("python");
	session.getTransaction().commit();
	session.close();
	System.out.println("upadated sussessfully");
	}

}
