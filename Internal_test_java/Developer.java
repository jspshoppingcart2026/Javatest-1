package Internal_test_java;

public class Developer extends Employee{
	String name;
	int id;
	double salary;
	Developer(String name,int id,double salary){
		super(name,id,salary);
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void employeedetail() {
		System.out.println("developer detail!....");
		System.out.println("developer name: "+empname);
		System.out.println("developer id: "+empid);
		System.out.println("developer salary: "+empsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Developer("Selva",13,10986.12);
		e1.employeedetail();
		

	}

}
