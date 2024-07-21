package basicprgrms;

public class Palindrome {
public static void main(String[] args) {
	int num=12121,rev=0;
	
	int temp=num;
	
	while(num!=0) {
		
		int lg=num%10;
		
		rev=(rev*10)+lg;
		
		num=num/10;
		
	}
	System.out.println("The reversed string is"+ rev);
	
	if(temp==rev) {
		System.out.println("The no. is palindrome");
	}
	else {
		System.out.println("The no. is not a palindrome");
	}
	
}
}
