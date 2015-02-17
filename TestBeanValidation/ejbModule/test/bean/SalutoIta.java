package test.bean;

import test.interfaccia.ItaSaluto;
import test.interfaccia.SalutoInterface;

@ItaSaluto
public class SalutoIta implements SalutoInterface {

	public SalutoIta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salutare(String s) {
		System.out.println("Ciao " + s);
	}

}
