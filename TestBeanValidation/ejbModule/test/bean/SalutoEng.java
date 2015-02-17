package test.bean;



import javax.enterprise.inject.Produces;
import test.interfaccia.EngSaluto;
import test.interfaccia.SalutoInterface;
import test.interfaccia.Random;

@EngSaluto
public class SalutoEng implements SalutoInterface {

	public SalutoEng() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salutare(String s) {
		System.out.println("Hello " + s);
	}
	
	@Produces @Random
	public double random(){
		return 10;
	}

}
