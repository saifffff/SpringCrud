package springControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	
	@RequestMapping("/")
	public String goHome() {
		System.out.println("Sending you to index.jsp");
		return "index";
	}
}
