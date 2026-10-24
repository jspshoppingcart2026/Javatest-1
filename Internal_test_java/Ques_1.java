package Internal_test_java;

public class Ques_1 {

	public static void main(String[] args) {
		byte b=50;      // primitive data type
		System.out.println(b);
		short s=190;
		System.out.println(s);
		int number=10;
		System.out.println(number);
		char ch='c';
		System.out.println(ch);
		float f=0.12f;
		System.out.println(f);
		double d=123.21444;
		System.out.println(d);
		
		//type casting
		
		int a=10;
		String str=String.valueOf(a);//Integer to string value
		System.out.println(str);
		char ch1='c';
		String str1=String.valueOf(ch1);//character to string 
		System.out.println(str1);
		float f1=12.87f;
		String str2=String.valueOf(f1);//float to string
		System.out.println(str2);
		String a1="true";
		boolean num1=Boolean.valueOf(a1); //string to boolean
		System.out.println(num1);
		String num2="1001";
		int num3=Integer.valueOf(num2);  //string to integer
		float f3=12.14f;
		int num4= (int)f3;              //float to integer
		System.out.println(num4);
		double d1=1113345.256;
		int num5=(int)d1;
		System.out.println(num5);      // double to integer
		
		
		
		

	}

}
