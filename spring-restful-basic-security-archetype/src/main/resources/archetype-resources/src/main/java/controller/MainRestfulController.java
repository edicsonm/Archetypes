#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ${package}.model.Greeting;
import ${package}.service.SaludarService;

@RestController("MainRestfulController")
@RequestMapping(value = "/api/greeting")
public class MainRestfulController {

	@Autowired
	SaludarService saludarService;
	
	@RequestMapping(method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Greeting getSaludar(){
		return saludarService.getGreeting();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public @ResponseBody Greeting postSaludar(@Valid @RequestBody Greeting saludo){
		saludarService.setGreeting(new Greeting(saludo.getSaludo()));
		return saludarService.getGreeting();
	}
	
}
