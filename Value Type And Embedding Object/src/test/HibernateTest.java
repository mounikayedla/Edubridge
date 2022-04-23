package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Adress;
import com.example.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adress address=new Adress();
address.setAddrLine("102/B,Light Tower");
address.setCity("Hyderabad");
address.setState("TS");
address.setPincode("50035");
UserDetails user=new UserDetails();
user.setName("Raj");
user.setAddress(address);
user.setPhone("9010208877");
SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
Session session=sessionFactory.openSession();
session.beginTransaction();
session.save(user);
session.getTransaction().commit();
session.close();




	}

}
