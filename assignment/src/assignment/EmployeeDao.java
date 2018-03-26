package assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDao {
	@Autowired
	private JdbcTemplate template;
	public void insert(Employee e){
		template.update("insert into Employee values(?,?,?,?)", new Object[] {e.getEmpid(),e.getEmpname(),e.getEmpsal(),e.getEmpdesg()});
		
	}
	public List<Employee> getAllemployee() {
		List<Employee> list=template.query("select * from employee", new EmployeeRowMapper());
	    return list;
	}
	public void delete(Employee e){
		template.update("Delete from employee where id=?",new Object[] {e.getEmpid()});
		
	}
	public void update(Employee e){
		template.update("update employee set name=? where id=?", new Object[] {e.getEmpname(),e.getEmpid()});
		template.update("update employee set salary=? where id=?", new Object[] {e.getEmpsal(),e.getEmpid()});
		template.update("update employee set designation=? where id=?", new Object[] {e.getEmpdesg(),e.getEmpid()});
		
	}
	
	
	

};
