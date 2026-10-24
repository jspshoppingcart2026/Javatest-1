package Internal_test_java;

public class Ques_13 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		try {
			System.out.println("loop time: "+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Ques_13 th=new Ques_13();
     Ques_13 th1=new Ques_13();
     th.start();
     th1.start();
     
	}

}
