package pattern;

import java.util.Scanner;

public class Array4Djack {
	public class Array3djack {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			
			System.out.println("enter the university count");
			int uni=sc.nextInt();
			
			
			
			String arr[][][][] =new String[uni][][][];
			
			
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(" in university no "+(i+1) +" enter the college count");
				arr[i]=new String[sc.nextInt()][][];
				
			}
			
			
			//class count
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("in university no."+(i+1));
					System.out.println("in college no."+(j+1));
					System.out.println("enter the class count");
					arr[i][j]=new String[sc.nextInt()][];
					
				}
				
			}
			
			
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("in university no."+(i+1));
					System.out.println("in college no."+(j+1));
					System.out.println("in class no" +(k+1));
					System.out.println("enter the student count");
					arr[i][j][k]=new String[sc.nextInt()];
					
				}
				
			}
			
			}
			
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("in university no :" +(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println(" in college no " +(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("in class no. "+(k+1));
						for(int l=0;l<arr[i][j][k].length;l++) {
							System.out.println("enter students name "+(l+1));
					
				
				arr[i][j][k][l]=sc.next();
					}
					}
			}
			
		}
			for(int i=0;i<arr.length;i++){
				System.out.println("inside the university no : " +(i+1));
				for(int j=0;j<arr[i].length;j++) {
					
					System.out.println(" in college no  " +(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						
						System.out.println(" in class no  " +(k+1));
						for(int l=0;l<arr[i][j][k].length;l++) {
						
					System.out.println("the name student no. " +(l+1)+" is "+arr[i][j][k][l]);
				
					}
			}
			
		}
			
			
			
		}
	}
	}
}

