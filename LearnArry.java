package week1.day2;

import java.util.Arrays;


public class LearnArry {

	public static void main(String[] args) {
int[] numArr= {12,6,7,9,5,13,177,266};
 int length = numArr.length;
System.out.println(length);

System.out.println(numArr[length-2]);
System.out.println(numArr[length-1]);
System.out.println("for loop");
for ( int i=0;i<numArr.length;i++) {
	System.out.println(numArr[i]);
	}
Arrays.sort(numArr);
System.out.println("sorted out");
for ( int i=0;i<numArr.length;i++) {
	System.out.println(numArr[i]);
	
}
System.out.println("smallest numer");
System.out.println(numArr[0]);
System.out.println("lerger num");
System.out.println(numArr[length-1]);
	}
}