package test.ejb;

import javax.annotation.PostConstruct;

public class BeanCDI {

	public BeanCDI() {
		// TODO Auto-generated constructor stub
	}
	
	
	@PostConstruct
	public void avvio(){
		System.out.println("Avvio BeanCDI");
	}

}
