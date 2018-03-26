package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		String hibernatequery="select obj from pack.Employee obj where obj.salary>=35000";
		Query query=s.createQuery(hibernatequery);
		@SuppressWarnings("rawtypes")
		List list=query.list();
		@SuppressWarnings("rawtypes")
		Iterator it=list.iterator();
		while(it.hasNext()){
			Employee e=(Employee)it.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("**** To retrieve only name of Employee ****");
		String hibernatequery1="select obj.name from pack.Employee obj";
		Query query1=s.createQuery(hibernatequery1);
		@SuppressWarnings("rawtypes")
		List list1=query1.list();
		@SuppressWarnings("rawtypes")
		Iterator it1=list1.iterator();
		while(it1.hasNext()){
			String empnames=(String)it1.next();
			System.out.println(empnames);
		}
		s.close();
		sf.close();
		
		

	}

}
