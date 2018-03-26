package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="c")
public class Customer extends Person {
  String bankname;

public Customer(int uid, String name, String bankname) {
	super(uid, name);
	this.bankname = bankname;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public String getBankname() {
	return bankname;
}

public void setBankname(String bankname) {
	this.bankname = bankname;
}
 
}
