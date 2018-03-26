package org.gontuseries.springcore;

public class Restaurant {
	private String welcomenote;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWelcomenote() {
		return welcomenote;
	}

	public void setWelcomenote(String welcomenote) {
		this.welcomenote = welcomenote;
	}
	
   private void destroy(){
	   System.out.println("destroy method");
   }
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("init method");

	}

}
