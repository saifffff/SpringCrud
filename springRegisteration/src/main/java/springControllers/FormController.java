package springControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.User;
import springServices.UserService;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/submitForm")
	public String handleForm(@ModelAttribute User user) {
		int val = this.userService.createUser(user);
		if(val == 1) {
			System.out.println("User Created Successfully");
		}else {
			System.out.println("Failed to create user");
		}
		return "regSuccess";
	}
	
	@RequestMapping("/regSuccess")
	public void goRegSuccess() {
		System.out.println("From regsuccess !!!");
	}
}
