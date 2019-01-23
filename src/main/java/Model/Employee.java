package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String residence;
	private int salary;
	
	public Employee(int id, String name, String residence, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.residence = residence;
		this.salary = salary;
	}
	
	public Employee(String name, String residence, int salary) {
		super();
		this.name = name;
		this.residence = residence;
		this.salary = salary;
	}

}
