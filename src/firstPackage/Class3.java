package firstPackage;

public class Class3 {

	public static void main(String[] args) {
		Class3 tom = new Class3();
		tom.happy(5.99, 2.99);
		tom.happy(5.99, 2.99, 3.99);
		
	}
public void happy(double a, double b) {
System.out.println(a+b);	
}
	
public void happy(double a, double b,double c) {
System.out.println(a+b+c);	
}
	
	
}
