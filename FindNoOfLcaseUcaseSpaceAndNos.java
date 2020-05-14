package day2;

public class FindNoOfLcaseUcaseSpaceAndNos {

	public static void main(String[] args) {
		String s = "1. It is Work from Home  not Work for Home";
		int countspace =0;
		int uppercase =0;
		int lowercase=0;
		int numbers = 0;
		char[] charArray = s.toCharArray();
		
		for (char c : charArray) {
		
			String valueOf =String.valueOf(c);
			
		if(c==' ')
		{
			countspace = countspace+1;
		}
		else if(Character.isUpperCase(c)){
			uppercase = uppercase +1;
		}
		else if(Character.isLowerCase(c))
		{
			lowercase = lowercase +1;
		}	
		else if(Character.isDigit(c))
		{
			
		numbers = numbers+1;
			
		}

	}
			System.out.println("Integers = "+ numbers);
			System.out.println("Lowercase =" + lowercase);
			System.out.println("Uppercase =" + uppercase);
			System.out.println("Spaces =" + countspace);
			
	}
	
}
