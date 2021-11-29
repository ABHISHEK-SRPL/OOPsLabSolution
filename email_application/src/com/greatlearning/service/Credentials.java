package com.greatlearning.service;

import java.util.*;

import com.greatlearning.model.Employees;

public class Credentials {

	 String alfa1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String alfa2 = "abcdefghijklmnopqrstuvwxyz";
	 String num = "1234567890";
	 String special= "!@#$%&";
	
	 String finalpass = alfa1 + alfa2 + num + special;
	
	Random random = new Random();
	  	
	 public char[] genpass() {	
			char[] pass = new char[10];
		 
		 for(int i = 0; i < 10; i++) {
					
			 pass[i] = finalpass.charAt(random.nextInt(finalpass.length()));
			 }	
			return pass;
	 }
	 
	 public String generateemail(String firstname, String lastname, String dept) {
		return firstname + lastname + "@" + dept + ".abc.com";
	}
	 
	 public void showcredentials(Employees employee, String email, char[] genpass) {
		 
		 System.out.println("Dear " + employee.getFirstname() + " your credentials are");
		 System.out.println("Email: " + email);
		 System.out.print("Password: ");
		 System.out.println(genpass);
	 }
}
