package Internal_test_java;

public class Trainer extends Employee{
	String tname;
	int tid;
	double tsalary;
	Trainer(String tname,int tid,double tsalary){
		super(tname,tid,tsalary);
		this.tname=tname;
		this.tid=tid;
		this.tsalary=tsalary;
	}
	public void employeedetail() {
		System.out.println("developer detail!....");
		System.out.println("developer name: "+tname);
		System.out.println("developer id: "+tid);
		System.out.println("developer salary: "+tsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Trainer("Jency",15,123141.133);
		e1.employeedetail();
		

	}

}
