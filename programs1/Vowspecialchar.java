package programs1;

import java.util.Scanner;

public class Vowspecialchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the string");
		String str=sc.nextLine();
		
		String str1="";
		
		switch (str) {
		case "a" : {
			str1=str1+'@';
			
		}
		case "A" : {
			str1=str1+'@';
			
		}
		case "e" : {
			str1=str1+'!';
			
		}
		case "E" : {
			str1=str1+'!';
			
		}
		case "i" : {
			str1=str1+'#';
			
		}
		case "I" : {
			str1=str1+'#';
			
		}
		case "o" : {
			str1=str1+'$';
			
		}
		case "O" : {
			str1=str1+'$';
			
		}
		case "u" : {
			str1=str1+'%';
			
		}
		case "U" : {
			str1=str1+'%';
			
		}
		default:
			int i = 0;
			str1=str1+str.charAt(i);
			str=str1;
			System.out.println(str1);
		}
	
	
	
}
}
