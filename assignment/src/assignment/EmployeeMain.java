package assignment;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee employee = (Employee) context.getBean("employeeObject");

		Scanner sc=new Scanner(System.in);
		int n;
		int empid;
		//String empname,empdesg;
		//double empsal;
		System.out.println("******** Employee Management System ********");
		
		System.out.println("1.add 2.delete by id 3.displayyall 4.updatebyid 5.exit");
		do{
			System.out.println("enter your choice");
	     n=sc.nextInt();
		switch(n){
		case 1:
			System.out.println("**** Performing Insert ****");
			System.out.println("enter id,name,slary,designation");
			System.out.println("enter id");
			employee.setEmpid(sc.nextInt());
			System.out.println("enter name");
			employee.setEmpname(sc.next());
			System.out.println("enter salary");
			employee.setEmpsal(sc.nextDouble());
			System.out.println("enter designation");
			employee.setEmpdesg(sc.next());
			service.insert(employee);
			System.out.println("Everything went fine!");
			break;
		case 2:
			System.out.println("*** Performing Delete ***");
			System.out.println("enter an id");
			empid=sc.nextInt();
			employee.setEmpid(empid);
			service.delete(employee);
			
			break;
			
		case 3:
			System.out.println("**** Displaying All Employees ****** ");
			List<Employee> employeeList = service.getEmployee();
			for(Employee e : employeeList) {
				System.out.println(e.getEmpid()+ " "+e.getEmpname()+" "+e.getEmpsal()+" "+e.getEmpdesg());
			}

			break;
		case 4:
			int ch;
			System.out.println("update information");
			System.out.println("enter id");
			empid=sc.nextInt();
			employee.setEmpid(empid);
			service.update(employee);
			do{
				ch=sc.nextInt();
				switch(ch){
				case 1:
					System.out.println("enter an name");
					employee.setEmpname(sc.next());
					service.update(employee);
					break;
				case 2:
					System.out.println("enter an name");
					employee.setEmpsal(sc.nextDouble());
					service.update(employee);
					break;
				case 3:
					System.out.println("enter an name");
					employee.setEmpdesg(sc.next());
					service.update(employee);
					break;
				}
			}while (ch>=4);
			
		case 5: 
			System.out.println("***Main menu exits***");
		
			System.out.println("****Thank you for visiting*****");
		    break;
		    
		
		
			
			
			
		}
		
		}while(n<=5);

	}

}
