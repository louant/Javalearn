import TestPackage.OverloadDemo;
public class OverloadTest {
	public static void main(String args[]){
		OverloadDemo ob = new OverloadDemo();
		
		ob.test();
		ob.test(10);
		ob.test(10,20);
		double result = ob.test(123.25);
		System.out.println("Result of  ob.test(123.25): "+ result);
	}
}
