package example.example.tests;

public class Demo {
	/*
	 * static void Addition(int x , int y) { System.out.println(x+y); }
	 */
	static void Fname( String fname, int age) {
		System.out.println( "My name is " + fname+ "My age is "+ age);
	}

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var =  System.getProperty("user.dir");
		System.out.println(var);
		/* Addition(13,15); */
		int x=3;
		int y=5;
		
		System.out.println(x+y);
		Fname("Ajay",18);
		Fname("Vijay",20);

	}

}
