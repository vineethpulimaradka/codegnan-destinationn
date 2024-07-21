package pattern;

public class Assign3 {

	public static void main(String[] args) {
		int arr1[][]= {{2,3,7},
				       {9,8,4},
				       {7,6,4}};
		
		int arr2[][]= {{1,5,9},
		               {3,5,7},
		               {5,7,11}};
		
		int result[][] =new int [3][3];
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				result[i][j]=arr1[i][j]+arr2[i][j];
			
			}}
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				System.out.print(result[i][j]+" ");
			
			}
		System.out.println();
	}
	}
}
