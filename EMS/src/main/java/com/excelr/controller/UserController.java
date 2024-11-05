package com.excelr.controller;

import java.security.Principal;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.excelr.DTO.UserDto;
//import com.excelr.model.Employee;
//import com.excelr.service.EmployeeService;
import com.excelr.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserDetailsService userDetailsService;
	
//	 @Autowired
//	    private EmployeeService employeeService;


	@Autowired
	private UserService userService;

	@GetMapping("/registration")
	public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
		return "register";
	}

	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("message", "Registered Successfuly!");
		return "login";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	  @GetMapping("/user") public String userPage (Model model, Principal
	  principal) { UserDetails userDetails =
	  userDetailsService.loadUserByUsername(principal.getName());
	  model.addAttribute("user", userDetails); return "employee/user"; }
	  
//	  @GetMapping("/view-employee/{companyMail}")
//	    public String viewEmployeeDetails(@PathVariable("companyMail") String companyMail, Model model) {
//	        Optional<Employee> employeeOpt = employeeService.getEmployeeByMail(companyMail);
//
//	        if (employeeOpt.isPresent()) {
//	            model.addAttribute("employee", employeeOpt.get());
//	            return "employee/view-employee"; // return the view template to display employee details
//	        } else {
//	            model.addAttribute("error", "Employee not found");
//	            return "Not Found"; // Redirect if the employee is not found
//	        }
//	    }

}
