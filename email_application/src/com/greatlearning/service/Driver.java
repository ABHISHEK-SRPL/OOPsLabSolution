package com.greatlearning.service;

import java.util.*;

import com.greatlearning.model.*;

public class Driver {
	
public static void main(String args[]) {
		
		Employees emp1 = new Employees("Abhishek","Dixit");
		
		Credentials cred1 = new Credentials();
		String email;
		char [] password;
		
		System.out.println("Please select department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int option;
		
		Scanner input = new Scanner(System.in);
				option = input.nextInt();
		
		switch (option) {
		
		case 1 :
			email = cred1.generateemail(emp1.getFirstname(),emp1.getLastname(),"tech");
			password = cred1.genpass();
			cred1.showcredentials(emp1, email, password);
			break;
			
		case 2 :
			email = cred1.generateemail(emp1.getFirstname(),emp1.getLastname(),"admin");
			password = cred1.genpass();
			cred1.showcredentials(emp1, email, password);
			break;
			
		case 3 :
			email = cred1.generateemail(emp1.getFirstname(),emp1.getLastname(),"hr");
			password = cred1.genpass();
			cred1.showcredentials(emp1, email, password);
			break;
			
		case 4 :
			email = cred1.generateemail(emp1.getFirstname(),emp1.getLastname(),"lg");
			password = cred1.genpass();
			cred1.showcredentials(emp1, email, password);
			break;
			
			default : System.out.println("Please select a valid Department");
		}
	input.close();
	}

}
