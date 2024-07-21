package programs1;

import java.util.Scanner;

public class Reverseanum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0;
		int n=sc.nextInt();
		
		while(n!=0) {
			int ld=n%10;
			
			rev=(rev*10)+ld;
			
			n=n/10;
			
		}
		System.out.println(rev);

	}

}
