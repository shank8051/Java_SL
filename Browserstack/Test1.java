package Browserstack;

public class Test1 {
	public int roll = 10;
	public static String name = "Shankar";
	
public static void main(String args[]) throws Exception{
	System.out.println("in main");
	 Test1 obj = new Test1();
	 obj.doAddition();
	 System.out.println("The roll num:" +obj.roll);
	 System.out.println("The Name is:" +name);

}

public void doAddition(){
	System.out.println("Iam doing addtion");
}
}