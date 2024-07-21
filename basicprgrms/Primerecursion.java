package basicprgrms;

public class Primerecursion {
	static int i=2;
	

	public static boolean prime(int n){
		
		if(n==0||n==1) {
			return false;
			
		}
		if(n==i) {
			return true;
			
		}
		if(n%i==0) {
			return false;
		}
		i++;
		return prime(n);
		
	}
	
	public static void main(String[] args) {
		int n=4;
		if(prime(n)) {
			System.out.println(n+ " is a prime no.");
		}
		else
			System.out.println(n+ " is not a prime no.");

	}

}
