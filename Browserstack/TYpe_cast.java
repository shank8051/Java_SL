package Browserstack;

public class TYpe_cast {
	public static int num = 10;
	public static double sal = 100.5;
	
	
	public static void main(String args[]) {
		System.out.println("The integer value" +num);
		
		double num1 = num;
		System.out.println("The integer value" +num1);
		System.out.println("The Sal value" + (int)sal);
		System.out.println("The String Sal value" + String.valueOf(sal));
		
	}

}
