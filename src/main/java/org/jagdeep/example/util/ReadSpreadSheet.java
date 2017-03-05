/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jagdeep.example.employee.Employee;

public class ReadSpreadSheet {

	private static String SPREADSHEET = "src/main/resources/employee-list.xlsx";

	public static List<Employee> getData() {
		List<Employee> listEmployees = new ArrayList<>();
		try {
			FileInputStream file = new FileInputStream(new File(SPREADSHEET));

			XSSFWorkbook workEmployee = new XSSFWorkbook(file);
			XSSFSheet spreadsheet = workEmployee.getSheetAt(0);
			Iterator<Row> rowIterator = spreadsheet.iterator();
			XSSFRow row;
			while (rowIterator.hasNext()) {
				row = (XSSFRow) rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				Employee employee = new Employee();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					int columnIndex = cell.getColumnIndex();
					switch (columnIndex) {
					case 0:
						employee.setSno((int) cell.getNumericCellValue());
						break;
					case 1:
						employee.setName(cell.getStringCellValue());
						break;
					case 2:
						employee.setAge((int) cell.getNumericCellValue());
						break;
					case 3:
						employee.setCompany(cell.getStringCellValue());
						break;
					case 4:
						employee.setSalary((Double) cell.getNumericCellValue());
						break;
					}
				}
				listEmployees.add(employee);
			}
			file.close();
			workEmployee.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listEmployees;
	}

}
