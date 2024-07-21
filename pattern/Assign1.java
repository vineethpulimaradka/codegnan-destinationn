package pattern;

public class Assign1 {

	public static void main(String[] args) {
		int arr[]= {10,72,89,64,41,89,237,191};
		int even=0;
		int odd=0;
	
			for(int i=0;i<arr.length;i++) {
				 if(i%2==0)
				 {
					 even += arr[i];
				 }
				 else {
					 odd += arr[i];
				 }
					
					
				}
			System.out.println("sum of even positions "+even);
			System.out.println("sum of odd positions " +odd);
		

	}}
	


