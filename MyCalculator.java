package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int result= obj.add();
		System.out.println("add value :" + result );
		int num= obj.sub();
System.out.println("sub values is ;" + num);
 double value= obj.mul();
 System.out.println("mulcation is:" + value);
 float mark = obj.divide();
 System.out.println("didvide:" + mark);
 
	}

}
