package com.kumar.springserver;

import com.kumar.springserver.model.employee.Employee;
import com.kumar.springserver.model.employee.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeService dao;

	@Test
	void addEmployeeTest() {
		addEmployee("Bruce Wayne", "Building-X", "Security");
		addEmployee("Harvey Dent", "Building-2", "Police");
		addEmployee("Rachel", "Building-11", "IT");
	}

	private void addEmployee(String name, String location, String branch) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setLocation(location);
		employee.setBranch(branch);
		dao.save(employee);
	}

}
