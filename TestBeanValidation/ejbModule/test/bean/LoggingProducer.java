package test.bean;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.jboss.logging.Logger;

public class LoggingProducer {

	public LoggingProducer() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Produces
	private Logger createLogger(InjectionPoint injectionPoint){
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}

}
