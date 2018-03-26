package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DOING OPERATIOS BY PASSING ID AT RUNTIME");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("enter an id");
		int tempid=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee)s.get(Employee.class, tempid);
		if(e!=null){
			System.out.println("old name:"+e.getName());
			System.out.println("enter name to update");
			String tempname=sc.nextLine();
			e.setName(tempname);
			System.out.println("new name is"+e.getName());
			s.update(e);
			tx.commit();
		}
		else{
			System.err.println("sorry id"+tempid+"not found");
		}
		s.close();
		sf.close();
		sc.close();
	}

	
}
