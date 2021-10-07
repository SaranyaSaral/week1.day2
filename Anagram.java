package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String text1 ="stops";
String text2= "potss";
int length =text1.length();
int leng =text2.length();
 char a[]=text1.toCharArray();
 for(int i=0;i<length;i++) {
	
 }
char b[]=text2.toCharArray();
for(int j=0;j<leng;j++) {
	System.out.println("char2["+j+"]:"+b[j]);
}
Arrays.sort(a);
for(int i=0;i<length-1;i++) {
}
Arrays.sort(b);
for (int j=0;j<leng-1;j++) {
}
boolean result=Arrays.equals(a, b);
if(result==true) {
	System.out.println("string are anagream");
	
}
else {
	System.out.println("stringis  not anagrem");
}
	}


}
	
