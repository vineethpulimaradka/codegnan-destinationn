package basicprgrms;

import java.util.Scanner;

public class Primebelownval {

	public static boolean prime(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for n");
		int n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			if(prime(i)) {
				System.out.println(i);
				
			}
		}
	}
	
}
