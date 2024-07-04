package Polymorphism;
class Employee{
	private String name;
	private String role;
	 Employee(String name,String role){
		 this.name =name;
		 this.role =role;
	 }
	 public String getName() {
		 return name;
	 }
	 public String getrole() {
		 return role;
	 }
	 
	 double calculateSalary() {
		 return 0.0;
	 }
}
class manager extends Employee{
	private double baseSalary;
	private double bonus;
	manager(String name,double baseSalary,double bonus){
		super(name,"Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	double calculateSalary() {
		return baseSalary + bonus;
	}
}
class programmer extends Employee{
	private double baseSalary;
	private double overtimePay;
	programmer(String name,double baseSalary,double overtimePay ){
		super(name,"Programmer");
		this.baseSalary = baseSalary;
		this.overtimePay = overtimePay;
	}
	double calculateSalary() {
		return baseSalary + overtimePay;
	}
}
public class SalaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee emp1 = new manager("Ujwal",50000.0,2500.0);
     Employee emp2 = new programmer("Satish",30000.30,1500.0);
     System.out.println("Name : "+emp1.getName()+"\t Role : "+emp1.getrole()+"\t \tSalary:  $ "+emp1.calculateSalary());
     System.out.println("Name : "+emp2.getName()+"\t Role : "+emp2.getrole()+"\tSalary:  $ "+emp2.calculateSalary());
	}

}
