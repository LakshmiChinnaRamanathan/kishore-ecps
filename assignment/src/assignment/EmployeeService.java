package assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	public void insert(Employee e){
		dao.insert(e);
	}
	//public void delete(int empid){
		//dao.delete(empid);
	//}
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllemployee();
}
	public void delete(Employee e){
		dao.delete(e);
	}
	public void update(Employee e){
		dao.update(e);
	}
}
