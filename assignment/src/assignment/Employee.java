package assignment;

public class Employee {
	private int empid;
	private String empname;
	private double empsal;
	private String empdesg;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, double empsal, String empdesg) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empdesg = empdesg;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getEmpdesg() {
		return empdesg;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	
	

}
