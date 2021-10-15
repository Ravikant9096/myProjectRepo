import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		System.out.print("you are a java programer.");
//		
		  Scanner mobile = new Scanner(System.in);
		  System.out.println("enter first number");
		 
		int num_1 = mobile.nextInt();
//		System.out.println("enter second number");
//		int num_2 = mobile.nextInt();
//      int num_3 = num_1 + num_2;
//		System.out.println("enter for +, -, *, /");
//		char operator = mobile.next().charAt(0);
//		
//		switch (operator) {
//		case '+': 
//			{
//			
//			System.out.println(num_1 + num_2);
//			break;
//			}
//		case '-': 
//			{
//		
//			System.out.println(num_1 - num_2);
//			break;
//			}
//		case '*': 
//			{
//		
//			System.out.println(num_1 * num_2);
//			break;
//			}
//		default:
//			System.out.println("you are  enter wrong input");
//		return;
//		}

	
		/*
		 * if(num_1<num_2) {
		 * System.out.println("second number greater than first number");
		 * 
		 * }
		 * 
		 * else if(num_1==num_2) { System.out.println("both have equal"); } else {
		 * System.out.println("first number greater than second number"); }
		 */	
		/*
		 * for(int i=1;i<=num_1;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */	
		int num_fact = num_1;
		int num_4 = 1;
		while(num_1>0)
		{
		 
	
		num_4= num_fact *(num_1-1);
		num_fact =num_4;
		num_1 =num_1 - 1;
		}
		System.out.println(num_4);
		}

}
