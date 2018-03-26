package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		/*Transaction tx=s.beginTransaction();
		Employee emp=new Employee(555,"manickkam",60000);
		
		s.save(emp);
		
		tx.commit();
		*/
		Employee e=(Employee) s.get(Employee.class, 222);
		System.out.println("ID = "+e.getId()+" ,NAME= "+e.getName()+" , SALARY= "+e.getSalary());
		s.close();
		sf.close();
		System.out.println("********** SCUESSFULLY COMPLETED************");
	}

}
