package week1.day2;

import java.util.Arrays;


public class FindSecoendLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int length=data.length;
		Arrays.sort(data);
		for(int i=0; i<data.length; i++) {
			System.out.println(  i);
		
		// 2) Pick the 2nd element from the last and print it
		
	}
	System.out.println("seclerger:" +data[length-2]);
	
	}
}

