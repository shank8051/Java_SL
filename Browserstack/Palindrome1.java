package Browserstack;
import java.util.*;

public class Palindrome1 {
	
	public static void main(String args[]) {
		
		String Original,Reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string for reseveral:");
		Original = in.nextLine();
		
		int len = Original.length();
		for (int i = len-1; i>=0; i--)
		{
			Reverse = Reverse + Original.charAt(i);
			
		}
		
		if (Original.equals(Reverse))
		{
			System.out.print("The string:" +Original +" is a palindrome");
			
		}
		else 
			System.out.print("The string:" +Original +" is not a palindrome");
	}

}
