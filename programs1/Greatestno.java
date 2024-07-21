package programs1;

import java.util.Scanner;

public class Greatestno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no.");
		int b=sc.nextInt();
		System.out.println("enter the 3rd no.");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" a is greater");
		}
		
		else if(b>a && b>c) {
			System.out.println(b+" b is greater");
	}
		else {
			System.out.println(c+" c is greater");
		}

}
}
