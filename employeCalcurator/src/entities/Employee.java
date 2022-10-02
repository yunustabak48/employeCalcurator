package entities;
public class Employee {
	
	//nitelikler
    private String Name;
    private double Salary;
    private double WorkHours;
    private double HireYear;
    private double currentYear = 2021;
    
    // sınıfın kurucu metotları: name, salary ,workhours ,hireyear// 
    
    
    public Employee(String Name , int Salary , int WorkHours , int HireYear){
        setName(Name);
        setSalary(Salary);
        setWorkHours(WorkHours);
        setHireYear(HireYear);
        
       
    }
    
    //get setter
    
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getWorkHours() {
		return WorkHours;
	}
	public void setWorkHours(double workHours) {
		WorkHours = workHours;
	}
	public double getHireYear() {
		return HireYear;
	}
	public void setHireYear(double hireYear) {
		HireYear = hireYear;
	}
	public double getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(double currentYear) {
		currentYear = currentYear;
	}
	
	
	 
	
	

	 
	
	   }




    

