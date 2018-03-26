package pack;

import java.util.List;

public class Bank {
	private String bankname;
	private List<String> locations;
	public Bank(String bankname, List<String> locations) {
		super();
		this.bankname = bankname;
		this.locations = locations;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	

}
