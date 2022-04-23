package hibernatepkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {
public static void main(String[] args){
	UserDetails user=new UserDetails();
	user.setId(3);
	user.setName("Kavya");
	UserDetails user1=new UserDetails();
	user1.setId(4);
	user1.setName("Sandya");
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(user1);
	session.getTransaction().commit();
	session.close();
	System.out.println(user);
	System.out.println(user1);
}
}
