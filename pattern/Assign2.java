package pattern;

public class Assign2 {

	public static void main(String[] args) {
		int arr[]= {10,72,89,64,41,89,237,191};
		int even=0;
		int odd=0;
	
			for(int i=0;i<arr.length;i++) {
				 if(i%2==0)
				 {
					 even ++;
				 }
				 else {
					 odd ++;
				 }
					
					
				}
			System.out.println("total even no.s "+even);
			System.out.println("total odd no. s" +odd);

	}

}
