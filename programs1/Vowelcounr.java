package programs1;

import java.util.Scanner;

public class Vowelcounr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the string");
	String str=sc.nextLine();
	
	int capvow=0;
	int smallvow=0;
	int cons=0;
	
	
	
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u' ) {
			smallvow++;
		}
		
		else if(str.charAt(i)== 'A' || str.charAt(i)== 'E' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)== 'U' ) {
			capvow++;
		}
		else {
			cons++;
		}
	}
	System.out.println("length of the string  = " +str.length());
	System.out.println("no. of capital vowel = "+capvow);
	System.out.println("no.of small vowel  = "+smallvow);
	System.out.println("no. of consonents = "+cons);
}
}
