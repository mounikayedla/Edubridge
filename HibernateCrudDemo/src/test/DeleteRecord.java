package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Student;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		Student student=session.load(Student.class,5);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
		System.out.println("Deleted successfully");
	}

}
