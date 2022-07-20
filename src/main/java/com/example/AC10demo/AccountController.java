package com.example.AC10demo;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



// account

@Controller
public class AccountController {


	
	@GetMapping("/account")
	public String showAccountPage(Model model) {
		
		System.out.println("IN ACCOUNT CONTROLLER!!!");
			
		return "account";
	}


}