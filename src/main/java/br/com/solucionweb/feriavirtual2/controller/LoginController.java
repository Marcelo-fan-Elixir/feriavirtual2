package br.com.solucionweb.feriavirtual2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.solucionweb.feriavirtual2.model.UserLogin;

@Controller
@RequestMapping("/v1/login")
public class LoginController {
	
	@GetMapping("/v1/login")
	public String redicrectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(@RequestParam(name="error" , defaultValue = "", required = false) String error) {
		return "login";
	}
	
	
	@PostMapping("/logincheck")
	public String loginCheck(Model model,
			@ModelAttribute(name="userLogin") UserLogin userLogin) {
		model.addAttribute("userLogin", new UserLogin());
		if (userLogin.getUsername().contentEquals("user") &&
				userLogin.getPassword().contentEquals("user")) {
			return "contacts";
		}
		
		return "redirect:/login?error";
	}
	
}
