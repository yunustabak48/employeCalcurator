package console;
import entities.Employee;
import service.EmployeManager;

public class main {

	public static void main(String[] args) {
	Employee employee = new Employee("atakan",1000,45,2020);
	
	
	EmployeManager employeManager = new EmployeManager(employee);	
	employeManager.toString(employee);
	

	}

}
