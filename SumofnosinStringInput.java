package day2;

import java.util.Scanner;

public class SumofnosinStringInput {
	
	/*Program:sum of the given numbers inside a String
	e.g.=Input: "asdf1qwer9as8d7"
		output: 1+9+8+7 = 25
*/
	public static void main(String[] args) {

		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int a = 0;
		int sum = 0;
		
		String inputReplaced = input.replaceAll("[^0-9]", "");
		int length = inputReplaced.length();
		
		for (int i = 0; i < length; i++) {
			
			char eachchaar = inputReplaced.charAt(i);
			 a = Integer.parseInt(String.valueOf(eachchaar));
			 sum = sum +a;
			 System.out.print(a+ "+");
			 
			 
		}
		
			System.out.println(" =" + sum);
	}

}
