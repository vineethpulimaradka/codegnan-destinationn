package programs1;

import java.util.Scanner;

public class Allvowelspresntornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the string");
		String str=sc.nextLine();
		int flag=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u' || str.charAt(i)== 'A' || str.charAt(i)== 'E' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)== 'U') {
				
				flag++;
			}
			
		}
			if(flag==10) {
				System.out.println("all the vowels are  present");
			}
			else {
				System.out.println("all the vowels are NOT present");
		}
	}

}
