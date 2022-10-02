package service;
import entities.Employee;

public class EmployeManager  {
	
	
	public EmployeManager() {
		super();
	}


	private Employee employee;
	
	public EmployeManager(Employee employee) {
		super();
		this.employee = employee;
		
		
	}
	// Vergi
	
	
		public double Tax(){
	        if(employee.getSalary() > 0 && employee.getSalary() < 1000 ){
	            return 0;
	        }
	        else{
	            return  (employee.getSalary() * 3)/100;
	        }
	    }
		    //Maaş bonusu
		
		 public double Bonus(){
		        if(employee.getWorkHours() > 40){
		            return ((employee.getWorkHours()-40)*30);
		        }
		        else {
		            return 0;
		        }
		    }
		 
		 
		 //Maaş artışı
		 
		 public double raiseSalary(){
		        if(employee.getCurrentYear() - employee.getHireYear() < 10){
		            return ((employee.getSalary()*5)/100);
		        }

		        if(employee.getCurrentYear() - employee.getHireYear() > 9 && employee.getCurrentYear() - employee.getHireYear() < 20){
		            return ((employee.getSalary()*10)/100);
		        }

		        else{
		            return ((employee.getSalary()*15)/100);
		        }
		    }
		 public void toString(Employee employee){
		        System.out.println("Adı: " + employee.getName());
		        System.out.println("Maaşı: " + employee.getSalary());
		        System.out.println("Çalışma saati: " + employee.getWorkHours());
		        System.out.println("Çalışma yılı: " + employee.getHireYear());
		        System.out.println("Vergi: " + Tax());
		        System.out.println("Bonus: " + Bonus());
		        System.out.println("Maaş Artışı: " + raiseSalary());
		        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + ((employee.getSalary()+Bonus())-Tax()));
		        System.out.println("Toplam Maaş: " + (((employee.getSalary()+Bonus())-Tax())+raiseSalary()));
		    }
		
		 
		 
		

}
