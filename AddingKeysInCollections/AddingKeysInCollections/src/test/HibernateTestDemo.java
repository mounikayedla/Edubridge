package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Address;
import com.example.UserDetails;

public class HibernateTestDemo {

	  public static void main(String[] args) 
	    {
	        UserDetails user = new UserDetails();
	        
	        user.setUserName("Dinesh Rajput");
	        
	        Address address1 = new Address();
	        address1.setStreet("First Street");
	        address1.setCity("First City");
	        address1.setState("First State");
	        address1.setPincode("First Pin");
	        
	        Address address2 = new Address();
	        address2.setStreet("Second Street");
	        address2.setCity("Second City");
	        address2.setState("Second State");
	        address2.setPincode("Second Pin");
	        
	        user.getLisOfAddresses().add(address1);
	        user.getLisOfAddresses().add(address2);
	        
	        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        session.save(user);
	        session.getTransaction().commit();
	        session.close();
	    }
}
