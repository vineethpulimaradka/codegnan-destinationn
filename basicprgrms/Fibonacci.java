package basicprgrms;

import java.util.Scanner;

public class Fibonacci {
//	public static void fabi(int n) {
//		if(n==1) {
//			return;
//		}
//		
//	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3;
		System.out.print("enter the value of n :: ");
		int n =sc.nextInt();
		
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
		}
		}
		
		
		
	}


