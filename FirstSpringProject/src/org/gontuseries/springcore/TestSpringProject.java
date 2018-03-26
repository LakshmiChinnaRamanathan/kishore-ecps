package org.gontuseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
public static void main(String[] args){
	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
	((AbstractApplicationContext)context).registerShutdownHook();
	Restaurant r=(Restaurant)context.getBean("rest");
	//r.setWelcomenote("object is setting welcome note preparing");
	//r.greetCustomer();
	//Restaurant r1=(Restaurant)ctx.getBean("rest");
	//r1.setWelcomenote("object is setting welcome note preparing");
	//r1.greetCustomer();
	
}
}
