package pack;

public class Manager extends Employee {
	private int empcount;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, int empcount) {
		super(name, age);
		this.empcount = empcount;
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	@Override
	public String toString() {
		return "Manager [empcount=" + empcount + ", toString()="
				+ super.toString() + "]";
	}

	

}
