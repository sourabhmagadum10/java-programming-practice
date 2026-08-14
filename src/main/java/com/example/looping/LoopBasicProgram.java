package com.example.looping;

public class LoopBasicProgram {
	
	public static void oneToHundred() {
		int a= 1;
		while(a < 101) {
			System.out.println(a);
			a++;
		}
		
		do {
			System.out.println(":-"+a);
			a++;
		}while(a < 200);
		
		for( int i = 0; i < 500 ; i++) {
			if (i % 2 == 0) {
				System.out.println();
			}
			System.out.print(i);
		}
	}
	
	public static void digit(int num) {
		int n = 0;
		while(num > 0) {
			n = (n*10)+(num % 10) ;
			num/=10;
			
		}
		System.out.println(n);
	}
	
	public static void checkPalindrome(int num) {
		int temp = num;
		int rev =0; 
		if(num < 9 && num > -9) {
			System.out.println("palindrom");
		}
		else {
		while(num > 0 || num < 0 ) {
			rev = (rev*10)+(num%10);
			num/=10;
		}
		if(temp == rev) {
			System.out.println("Number is palindrom :)!");
		}
		else {
			System.out.println("Not :(");
		}
		}
		
	}
	
	public static int countDigit(int num) {
		int count = 0;
		
		while(num > 0) {
			count++;
//			int a = num % 10;
			num/=10;
		}
		return count;
	}
	
	public static void  checkArmstrong(int num) {
		int count = countDigit(num);
		int temp = num;
		int rev = 0;
		
		while(num  != 0) {
			 rev= num % 10; 
			rev += Math.pow(rev, count);
			num/=10;
			
		}
		if (rev == temp) {
			System.out.println("arMstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		oneToHundred();
//		digit(123);
//		checkPalindrome(199);
		checkArmstrong(153);
		
//		System.out.println(countDigit(123));
		
	}

}
