package programs1;

import java.util.Scanner;

public class Sumdvs3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
System.out.println(sum);
	}

}
