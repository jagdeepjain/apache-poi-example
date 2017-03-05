/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.poi.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.jagdeep.example.employee.Employee;
import org.jagdeep.example.util.ReadSpreadSheet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class employeeDataTest {

	@Test
	@DisplayName("Reading spreadsheet data based on sheet, row and column.")
	void readExcelDataTest() {
		List<Employee> listOfEmployees = ReadSpreadSheet.getData();
		assertThat(listOfEmployees.get(0).getSno()).isEqualTo(1);
		assertThat(listOfEmployees.get(0).getName()).isEqualTo("Jagdeep");
		assertThat(listOfEmployees.get(0).getAge()).isEqualTo(30);
		assertThat(listOfEmployees.get(0).getCompany()).isEqualTo("IBM");
		assertThat(listOfEmployees.get(0).getSalary()).isEqualTo(600000);
		
		assertThat(listOfEmployees.get(1).getSno()).isEqualTo(2);
		assertThat(listOfEmployees.get(1).getName()).isEqualTo("Nitesh");
		assertThat(listOfEmployees.get(1).getAge()).isEqualTo(40);
		assertThat(listOfEmployees.get(1).getCompany()).isEqualTo("ADP");
		assertThat(listOfEmployees.get(1).getSalary()).isEqualTo(900000);
	}
}
