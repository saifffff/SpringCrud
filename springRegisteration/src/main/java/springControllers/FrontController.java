package springControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	
	@RequestMapping("/home")
	public String goHome() {
		System.out.println("Sending you to index.jsp");
		return "index";
	}
	
	
	@RequestMapping("/")
	public String goIndex() {
		System.out.println("Sending you to index.jsp");
		return "index";
	}
	
	
	@RequestMapping("/register")
	public String goRegister() {
		System.out.println("sending you to registration page..");
		return "register";
	}
	
}
