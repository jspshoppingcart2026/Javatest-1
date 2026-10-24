package Internal_test_java;

final public class Ques_3 {     //final class-can't inherted
	final String studentname;   //final value-can't modify
	static String college="ABC College";//static-commen for all the students objects
	Ques_3(String studentname){
		this.studentname=studentname;
	}
	public final void display() {  //final method-can't override
		System.out.println("studentname: "+studentname);
		System.out.println("college name: "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques_3 student1=new Ques_3("Princy");
		Ques_3 student2=new Ques_3("Vishnu");
		student1.display();
		student2.display();

	}

}
