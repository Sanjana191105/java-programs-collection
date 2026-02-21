package JAVA;

public class encapsulation {
	private String name;
	private int salary;
	public void setName(String name , int salary) {
		this.name = name;
		this.salary= salary;
	}
	public void getName() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
		obj.setName("sanj", 50000);
		obj.getName(); 
		

	}

}
