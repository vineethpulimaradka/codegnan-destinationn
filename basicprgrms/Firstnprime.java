package basicprgrms;

import java.util.Scanner;

public class Firstnprime {

	public static boolean prime(int number) {
		 if(number<2) {
			 return false;
		 }
		 for(int i=2;i<Math.sqrt(number);i++) {
		 if(number % i==0) {
			 return false;
		 }
	}
		 return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=2;
		
		while(count<10) {
			if(prime(n)) {
				System.out.println(n);
				count++;
			}
			n++;
		}
		
		sc.close();
	}
	

}
