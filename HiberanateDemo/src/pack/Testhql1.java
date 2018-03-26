package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Testhql1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		String hql="select e.name,e.salary from pack.Employee e";
		Query query=s.createQuery(hql);
		@SuppressWarnings("rawtypes")
		List list=query.list();
		@SuppressWarnings("rawtypes")
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object[] obj=(Object[])it.next();
			String name=(String)obj[0];
			Double salary=(Double)obj[1];
			System.out.println("name ="+name+ "salary="+salary);
			
		}
		s.close();
		sf.close();
	}

}
