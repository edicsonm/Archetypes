#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	
	@RequestMapping(value = {"/" },method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("title", "Main Page");
		model.addAttribute("message", "This is the first page");
		return "main";
	}
	
	@RequestMapping(value = {"/main" },method = RequestMethod.GET)
	public String main(Model model) {
		System.out.println("Pasa por aca ... ");
		model.addAttribute("title", "Main Page");
		model.addAttribute("message", "This is the first page");
		return "main";
	}
	
	@RequestMapping(value = {"/db" },method = RequestMethod.GET)
	public String db(Model model) {
		System.out.println("Pasa por aca ... ");
		model.addAttribute("title", "Main Page");
		model.addAttribute("message", "This is the first page");
		return "db";
	}
	
	@RequestMapping(value = {"/admin" },method = RequestMethod.GET)
	public String admin(Model model) {
		System.out.println("Pasa por aca ... ");
		model.addAttribute("title", "Main Page");
		model.addAttribute("message", "This is the first page");
		return "admin";
	}
	
	@RequestMapping(value = {"/login"},method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
}
