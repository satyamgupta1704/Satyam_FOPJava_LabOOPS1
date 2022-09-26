package com.greatlearning.lab1.driver;

import com.greatlearning.lab1.entity.Employee;
import com.greatlearning.lab1.service.CredentialService;

//A driver class to run the logistics by taking Employee entity and CredentialService service
public class CredentialDriver {

	// main method
	public static void main(String[] args) {

		/*
		 * invoking Employee class object employee with parameterized constructor
		 * Employee(firstName, lastName)
		 */
		Employee employee = new Employee("Satyam", "Gupta");

		/* Creating CredentialService class object credentialService to invoke 
		 * generateEmailAddress() and generatePassword() methods
		 */
		CredentialService credentialService = new CredentialService();
		
		/*
		 * Define firstName and lastName which uses getter method for getting values
		 * from the constructor
		 */
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();

		/*
		 * Define department which uses selectDepartment method under CredentialService
		 * for fetching the value based on user input
		 */
		String department = CredentialService.selectDepartment();

		/*
		 * Define if-else condition for validity of department and accordingly plan
		 * course of action. Here, we decide if department is valid, then we generate
		 * credentials and then display those details. Or, else we print a message
		 * stating to try again with valid input
		 */
		if (department != "Invalid") {
			CredentialService.showCredentials(employee,
					credentialService.generateEmailAddress(firstName.toLowerCase(), lastName.toLowerCase(), department),
					credentialService.generatePassword());
		}

		else {
			System.out.println("Invalid Input, Try Again!");
		}

		System.exit(0);
	}

}
