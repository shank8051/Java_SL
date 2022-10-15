package Browserstack;

public class Fibonnaci_Recursion {
	
	static int n1=0, n2=1, n3=0;
	
	static void printfibo(int count) {
		
		if(count >0)
		{
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			printfibo(count-1);
		}
		
	}
	
	public static void main(String agrs[]) {
		
		int count = 10;
		 System.out.print(n1+" "+n2);
		 printfibo(count);
	}

}
