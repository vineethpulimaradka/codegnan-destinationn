package pattern;

public class Assign4 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,1,5,2,5,2,1};
		
		int dup=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				dup++;
				break;
			}
			
		}
		}
		
		System.out.println(dup);
		
	}
	
}
