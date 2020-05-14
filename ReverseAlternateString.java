package day2;

public class ReverseAlternateString {

	/*Program to reverse alternate string
	Input: "When the world realise its own mistake, corona will dissolve automatically"
	output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"*/
	
	
	public static void main(String[] args)
	{
		String s = "When the world realise its own mistake, corona will dissolve automatically";
		String appendChar = "";
		char charAt = ' ';
		String[] split = s.split(" ");
		
		System.out.println(split.length);
		
		for (int i = 0; i < split.length; i++) {
			String eachString = split[i];
			if(i%2!=0) {
				
			for (int j = eachString.length()-1; j >=0; j--) {
				
				 charAt = eachString.charAt(j);
				 appendChar=appendChar+charAt; 
			}
			System.out.print(appendChar + " ");
			}
			else
			{
			
				System.out.print(eachString + " ");
			
			}
			appendChar = "";
			
		}
		
		

	}

}
