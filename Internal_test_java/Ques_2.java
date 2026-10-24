package Internal_test_java;
import java.util.Scanner;
public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("number is positive");
		}
		else if(number<0){
			System.out.println("number is negative");
		}
		else if(number==0){
			
		}System.out.println("number is nutral");

	}

}
