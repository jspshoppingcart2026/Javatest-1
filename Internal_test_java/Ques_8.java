package Internal_test_java;
import java.util.*;
public class Ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 1st number: ");
    int num1=sc.nextInt();
    System.out.println("enter the 2nd number: ");
    int num2=sc.nextInt();
    System.out.println("enter the 3rd number: ");
    int num3=sc.nextInt();
    if(num1>num2) {
    	if(num1>num3) {
    		System.out.println("num1 is greater");
    	}
    	else {
    		System.out.println("number three is greater");
    	}
    }else {
    	 if(num3<num2) {
    		 System.out.println("number two is greater");
    	 }
    	 else {
    		 System.out.println("number three is greater");
    	 }
    }
	}

}
