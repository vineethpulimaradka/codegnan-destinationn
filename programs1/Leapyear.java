package programs1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the year ");
		int n = sc.nextInt();
		if(checkleapyear(n)==true) {
			System.out.println("it is leap year");
			
		}
		else {
			System.out.println("not leap year");
		}
		
		
	}
public static boolean checkleapyear(int n) {
	
	if(n%400==0) {
		return true;
	}
	else if(n%100==0 && n%400!=0) {
		return false;
	}
	else if (n%4==0 && n%100!=0) {
		
		return true;
	}
	
	
	return false;
}
}