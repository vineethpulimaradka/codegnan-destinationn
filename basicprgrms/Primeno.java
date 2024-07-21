package basicprgrms;

import java.util.Scanner;

public class Primeno {
	
	static void checkprime(int n) {
		int m=0,flag=0;
		
		m=n/2;
		
		if(n==0||n==1) {
			System.out.println(n+ " is not a prime no.");
			
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("it is not a prime no.");
					
					flag=1;
					break;
				}}
		if(flag==0) {
			System.out.println(n+ " is  a prime no.");
		}
		
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("** Enter the no. ** ::");
		int n=sc.nextInt();
		checkprime(n);
		
		
				
					
				
			
		
		

	}

}
