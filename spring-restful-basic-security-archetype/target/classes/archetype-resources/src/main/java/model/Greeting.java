#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Greeting {
	
	@NotEmpty
	@Length(min = 5, max = 20)
	private String saludo;
	
	public Greeting(){
	}
	
	public Greeting(String saludo){
		this.saludo = saludo;
	}
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
