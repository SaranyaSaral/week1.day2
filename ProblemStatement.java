package week1.day2;

public class ProblemStatement { 
	
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,9};
		 int target=10;
	
		for (int i=0; i<num.length; i++) {
			System.out.println( "the valuei"+num[i]);
			for (int j=i+1;j<num.length;j++) {
				System.out.println( "the value j"+num[j]);
				if(num[i]+num[j]==target) {
					System.out.println("with index:"+i+ num[i] );
					System.out.println(num[j] +"with index"+j);
				}
			
		}

	}

}
}
