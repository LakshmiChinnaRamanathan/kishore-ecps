package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Testinheritancemapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Person p=new Person(112,"uma");
		Customer c=new Customer(232,"lakshmi","hdfc");
		Student std=new Student(343,"manickkam","a");
		s.save(p);
		s.save(c);
		s.save(std);
		tx.commit();
		s.close();
		sf.close();

	}

}
