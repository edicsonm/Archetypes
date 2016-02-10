package it.pkg.service;

import org.springframework.stereotype.Service;

import it.pkg.model.Greeting;

@Service("SaludarService")
public class SaludarService {
	
	private Greeting greeting =  new Greeting("Primer Saludo");

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
}
