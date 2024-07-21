package pattern;

public class Assign5 {

	public static void main(String[] args) {
		
int col=0,row=0;
boolean flag=true;
  

int arr[][]= {{0,0,0},
		      {0,0,0},
		      {0,0,0}};

row=arr.length;
col=arr[0].length;

 if(row!=col) {
	System.out.println("enter the square matrix");
}
 
 else {
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 
			 if(i==j && arr[i][j]!=1) {
				 flag=false;
				 break;
			 }
			 
			 
			 if(i!=j && arr[i][j]!=0) {
				 flag=false;
				 break;
			 }
		 }
	 }
	 if(flag) 
		 System.out.println("it is identity matrix ");
		 
	 
	 else 
		 System.out.println("it is not identity matrix ");
	 }
 
	}
	
}
