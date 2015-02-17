package test.ejb;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.validation.*;

import test.interfaccia.EngSaluto;
import test.interfaccia.ItaSaluto;
import test.interfaccia.Random;
import test.interfaccia.SalutoInterface;
import test.model.Item;

/**
 * Session Bean implementation class SingletonEjb
 */
@Singleton
@LocalBean
@Startup
public class SingletonEjb {
	
	@Inject
	private Validator validator;
	
	//provo injection semplice
	@Inject
	private BeanCDI beanCdi;
	
	//provo Qualifiers (mettere @EngSaluto o @ItaSaluto)
	@Inject @EngSaluto
	private SalutoInterface salutoService;
	
	//provo Produces
	@Inject @Random
	private double numero;
	
	
	

    /**
     * Default constructor. 
     */
    public SingletonEjb() {
        // TODO Auto-generated constructor stub
    }
    
    
    @PostConstruct
    public void avvio(){
    	
    	System.out.println("Avvio Bean Singleton");
    	
    	   	
    	//provo Qualifiers
    	salutoService.salutare("Daniel Ciofani");
    	
    	System.out.println("Numero double: " + numero);
    	
    	
    	//provo validazione
    	Item item1 = new Item("Penna");
    	item1.setDescrizione("a");
    	Set<ConstraintViolation<Item>> violations = validator.validate(item1);
    	int nerr = violations.size();
    	System.out.println("N errori " + nerr);
    	
    	Iterator iteratore = violations.iterator();
    	while(iteratore.hasNext()){
    		ConstraintViolation cv = (ConstraintViolation) iteratore.next();
    		String s = cv.getMessage();
    		System.out.println(s);
    	}
    	//fine prova validazione
    	
    }

}
