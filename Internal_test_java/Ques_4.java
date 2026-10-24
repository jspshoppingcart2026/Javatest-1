package Internal_test_java;
import java.util.*;
public class Ques_4 {
	public static int fact(int n) {
		int factorial=1;
		for(int i=1;i<=n;i++) {
		        factorial*=i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for the factorial:  ");
		int n=sc.nextInt();
		
		System.out.println("fact value is: "+ fact(n));
		
      
	}

}
