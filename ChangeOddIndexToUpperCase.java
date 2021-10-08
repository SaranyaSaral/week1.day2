package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char[] ch = test.toCharArray();
		 for(int i=0; i<ch.length;i++) {
		 String up=test.toUpperCase();
		 char[] a=up.toCharArray();

			 if(i%2==1) {
				 System.out.print(   a[i]);
				 
			 }else {
				 System.out.print(ch[i]);
			 }
		 }
		 
	}

}
