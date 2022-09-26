package com.greatlearning.lab1.service;

import java.util.Random;
import java.util.Scanner;
import com.greatlearning.lab1.entity.Employee;

// A Service class CredentialService is created to handle logic and operations
public class CredentialService {

	// Define attributes and assign the applicable values
	private String domain_name = ".greatlearning.com";
	private String delimitter = "";
	private String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower_case = "abcdefghijklmnopqrstuvwxyz";
	private String numbers = "1234567890";
	private String special_chars = "!@#$%^&*()_+{}[]<>?/";

	/*
	 * Define method for generation of email address where we pass firstName,
	 * lastName and department as arguments
	 */
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String emailAddress = firstName + delimitter + lastName + "@" + department + domain_name;
		return emailAddress;
	}

	/*
	 * Define method for generation of password from a random sequence of characters
	 * by traversing a character array
	 */
	public String generatePassword() {
		String value = upper_case + lower_case + numbers + special_chars;
		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = value.charAt(random.nextInt(value.length()));
		}

		return new String(password);
	}

	/*
	 * Define a method to handle selection of department using scanner object with
	 * switch case logic
	 */
	public static String selectDepartment() {

		System.out.println("Please enter the department from the following");
		String department = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();

		switch (option) {

		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			department = "Invalid";
			break;
		}

		sc.close();
		return department;

	}

	/*
	 * Define a method to display the message along with employee's credentials once
	 * email and password are generated
	 */
	public static void showCredentials(Employee employee, String email, String password) {

		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows");
		System.out.println("Email         --->  " + email);
		System.out.println("Password  --->  " + password);

	}

}
