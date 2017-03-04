/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.employee;

public class Employee {

	private int sno;
	private String name;
	private int age;
	private String company;
	private Double salary;

	public Employee() {
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCompany() {
		return company;
	}

	public Double getSalary() {
		return salary;
	}

}
