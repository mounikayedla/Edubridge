package com.example;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder.. to convert trim input strings
	//remove leading and trailing whitespace
	//resolve issue for our validation
	//This method will called for every web request coming into our controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	//@Valid : performs validation rules on customer object
	//BindingResult : results of validation placed in the BindingResult
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResult){
		
		//printing to check if initbinder working properly or not.
		System.out.println("Last name:|"+theCustomer.getLastName()+"|");
		
		//you can view console and then figure out which error code that you need.
		//You can find those codes, drop them into your messages.properties file
		System.out.println("Binding result : "+theBindingResult);   
		
		System.out.println("\n\n\n");
		
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else{
			return "customer-confirmation";
		}
	}
}
