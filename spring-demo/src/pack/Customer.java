package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private Identifier id;
	@Autowired
	private Address address;


	public Customer() {
		super();
		System.out.println("default constructor is ddisplayed");
	}

	public Customer(Identifier id) {
		super();
		this.id = id;
		System.out.println("parameter is called");
	}

	public Identifier getId() {
		return id;
		
	}

	public void setId(Identifier id) {
		System.out.println("setid is called");
		this.id = id;
		
	}
	public void getInformations(){
		id.display();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
