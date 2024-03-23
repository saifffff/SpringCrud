package springControllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import Model.User;
import springServices.UserService;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/submitForm")
	public String handleForm(
			@ModelAttribute User user,
			Model model,
			BindingResult br
			) {
		if(br.hasErrors()) {
			for(ObjectError error : br.getAllErrors()) {
				System.out.println(error);
			}
			return "register";
		}else {
			createUser(user);
			
			List<User> allUsers = this.userService.getAllUsers();
			for(User x : allUsers) {
				System.out.println(x);
			}
			model.addAttribute("allUsers", allUsers);
			return "regSuccess";
		}
	}
	
	@RequestMapping("/regSuccess")
	public void goRegSuccess() {
		System.out.println("From regsuccess !!!");
		
	}
	
	@RequestMapping("/err")
	public void error() {
		System.out.println("taking you to error page...");
	}
	
	public int createUser(User user) {
		int val = this.userService.createUser(user);
		if(val == 1) {
			System.out.println("User Created Successfully");
		}else {
			System.out.println("Failed to create user");
		}
		return val;
	}
}
