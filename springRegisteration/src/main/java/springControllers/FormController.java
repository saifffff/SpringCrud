package springControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.User;

@Controller
public class FormController {
	
	@RequestMapping("/submitForm")
	public String handleForm(@ModelAttribute User user) {
		System.out.println(user);
		return "regSuccess";
	}
	
	@RequestMapping("/regSuccess")
	public void goRegSuccess() {
		System.out.println("From regsuccess !!!");
	}
}
