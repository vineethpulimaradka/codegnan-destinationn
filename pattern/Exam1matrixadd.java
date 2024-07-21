package pattern;

public class Exam1matrixadd {
public static void main(String[] args) {
	
		int arr1[][]= {{5,9,7},
				       {1,0,5},
				       {2,5,4}};
		
		int arr2[][]= {{2,6,9},
		               {3,5,7},
		               {5,6,10}};
		
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

