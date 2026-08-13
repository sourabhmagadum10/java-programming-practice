package com.example.conditional_statement;

public class IfElseBasic {
	public static void largestAmongThree(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			System.out.println("Num1 is grestest "+num1 );
		}
		else if(num2 > num3) {
			System.out.println("num2 is greastet " +num2);
		}
		else
			System.out.println("num 3 is greatest "+num3);
		//using ternary operator
		 String ans = num1 > num2 && num1 > num3 ? "num1 is grater" : num2 > num3 ? "num2 is grater" : "num3 is grater";
		 System.out.println(ans);
	}
	
	public static void votingEligibilty(int age) {
		if(age > 18)
			System.out.println("Eligible");
		else
			System.out.println("! Eligible");
		
		String ans= age > 18 ? "allow to vote": "not allowed";
		System.out.println(ans);
	}

	
	public static void passOrFail() {
		int math= 40;
		int eng= 37;
		int phy= 50;
		double tot= ((math + eng + phy)/ 3 ) ;
		System.out.println(tot + " total");
		int a= math > 35 && eng >35 && phy > 35 && tot > 35 ? 1 : 0;
		switch(a) {
		case 1: System.out.println("Pass");break;
		case 0: System.out.println("Fail");break;
		}
	}
	
	public static void calculater(char ch) {
		int a = 10;
		int b = 5;
		switch(ch) {
		case '+' : System.out.println(a+b);break;
		case '-' : System.out.println(a - b);break;
		case '*' : System.out.println(a * b);break;
		case '/' : System.out.println(a / b);break;
		default :System.out.println("enter a valid choice");
		}
		
	}
	
	public static void dayMonths(String ch) {
		int day = 1;
		switch(ch) {
		case "manson" : System.out.println("May to September");
		case "summer" :System.out.println("january to May");
		case "winter" : System.out.println("octember to december");
		}
		switch(day) {
		case 1 : System.out.println("Sunday");
		case 2 : System.out.println("Monday");
		case 3: System.out.println("Tuesday");
		case 4: System.out.println("wednesday");
		case 5: System.out.println("Thursday");
		case 6: System.out.println("Friday");
		case 7: System.out.println("Saturday");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		largestAmongThree(10, 200, 90);
//		votingEligibilty(19);
//		passOrFail();
		calculater('/');
	}

}
