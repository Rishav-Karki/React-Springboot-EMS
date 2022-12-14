package com.CF.FullStack.springboot;

import com.CF.FullStack.springboot.model.Employee;
import com.CF.FullStack.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Employee employee = new Employee();
		employee.setFirstName("Jermaine");
		employee.setLastName("Cole");
		employee.setEmailId("jc@dreamville.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Kendrick");
		employee1.setLastName("Lamar");
		employee1.setEmailId("kl@tde.com");
		employeeRepository.save(employee1);
		 */

	}
}
