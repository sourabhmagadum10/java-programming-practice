package com.example.basic;

import java.util.Scanner;

public class BasicPrograms {
	
	public static void arthmaticOperation(int num1, int num2) {
		int addition = num1 + num2;
		int substraction = num1 - num2;
		int multiplication = num1 * num2;
		int divsion = num1 / num2;
		int modules = num1 % num2;
		System.out.println(addition+ "\n"+substraction+ "\n"+ multiplication+ "\n"+divsion+"\n"+modules);
		
	}
	
	public static void swapTwoNum(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 -num2;
		num1 -= num2;
		System.out.println("NUm1 :- "+num1+ "num2 :-" +num2);
	}
	
	public static void swapThreeNum(int a, int b, int c) {
		 a= a+b+c;
		 b= a- (b+c);
		 c= a- (b+c);
		 a= a-(b+c);
		 
		 System.out.println("a :- "+a+ "\n b:-" +b+"\n c:- "+c);
	}
	
	public static void simpleInterst(int amount, int rate, int time) {
		int si= (amount + rate +time)/100 ;
		
		System.out.println(si);
	}
	
	public static void areaOfCircle(double redius) {
		redius = 3.14 * redius * redius;
		System.out.println(redius+ "Circle");
	}
	
	public static void areaOfRectangel(int width, int height){
		int area = width * height;
		System.out.println(area);
	}
	
	public static void areaOfSqure(int a) {
		int area= a*a;
		System.out.println(area);
	}
	
	public static void celsiusToFahrenheit(int celsius) {
		double fahrenheit = (celsius * 9/5) +32; 
		System.out.println(fahrenheit);
	}
	
	public static void checkLeapYear(int year) {
		String msg= (year%4 == 0) ?"leap year" :"Not leap year";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arthmaticOperation(10, 6);
//		swapTwoNum(10, 3);
//		swapThreeNum(12, 4, 10);
		simpleInterst(100000, 7, 12);
		checkLeapYear(2000);
	}

}
