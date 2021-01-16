package app;

import employeepack.Employee;
import managerpack.Manager;

 public class App {
	
	public static void main(String args[]) {
		Employee e = new Employee();
		e.print();
		
		Manager m = new Manager();
		m.print();
	}
}