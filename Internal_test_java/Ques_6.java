package Internal_test_java;

public class Ques_6 {
	String stdname;
	int stdid;
	int stdmark;
	
	Ques_6(String stdname,int stdid,int stdmark){
		this.stdname=stdname;
		this.stdid=stdid;
		this.stdmark=stdmark;
	}
	public void display() {
		System.out.println("student name: "+ stdname);
		System.out.println("student id: "+stdid);
		System.out.println("student mark: "+stdmark);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques_6 q3=new Ques_6("Keethana",25,86);
		q3.display();

	}

}
