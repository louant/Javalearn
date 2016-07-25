package TestPackage;

public class OverloadDemo {
	public void test(){
		System.out.println("No parameters");
	}
	
	//overload test for one integer parameter
	public void test(int a){
		System.out.println("a: "+a);
	}
	
	public void test(int a,int b){
		System.out.println("a and b: "+a+ " "+b);
	}
	
	public double test(double a){
		System.out.println("double a: "+a);
		return a*a;
	}
}
