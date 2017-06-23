package assignment3;

import java.util.Scanner;


public class Uma {
	static int add(int a, int b){//here we are declaring the the variables by taking static
		int c ;//to initialize the variables
		while (b!=0){// if b not equal to zero it will execute the loop till the condition get false
			c =a&b;//we are using and operator to add 
			a = a^b;
			b = c <<1;
			
		}
		return a;//return the value a 
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner (System.in);// to scan the values which we initialize
		System.out.println("enter the values of a,b");
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("summ of values is "+add(a,b));
}}