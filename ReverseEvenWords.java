package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "i am a sorfware  teat"; 
		String [] spilt = test .split(" ");
		for( int i=0;i<spilt.length;i++) {
			System.out.println("split["+i+"]:" +spilt[i]);
			if (i%2==0) {
				char[] temp=spilt[i].toCharArray();
				for(int j=temp.length-1;j>=0; j--) {
					System.out.println( temp[j]);
					
				}

System.out.println(" ");
				
			}
			else
			{
			System.out.println(spilt[i]+" ");
				
			
	}
		
}
}
}
