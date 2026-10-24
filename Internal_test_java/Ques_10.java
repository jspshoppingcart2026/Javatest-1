package Internal_test_java;
import java.util.*;
public class Ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> arr=new ArrayList<Integer>();
     arr.add(10);
     arr.add(20);
     arr.add(30);
     arr.add(10);
     arr.add(20);
     
     HashSet<Integer> set=new HashSet<Integer>(arr);
     System.out.println("printing value without duplicates"+set);
	}

}
