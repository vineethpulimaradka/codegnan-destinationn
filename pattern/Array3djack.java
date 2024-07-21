package pattern;

import java.util.Scanner;

public class Array3djack {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the school count");
		int sch=sc.nextInt();
		
		
		
		String arr[][][] =new String[sch][][];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" enter school no "+(i+1) +" enter the class count");
			arr[i]=new String[sc.nextInt()][];
			
		}
		
		
		//student count
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the school no."+(i+1));
				System.out.println("enter the class no."+(j+1));
				System.out.println("enter the student count");
				arr[i][j]=new String[sc.nextInt()];
				
			}
			
		}
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("in school no :" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" in class " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter name of the student "+(k+1));
				
			
			arr[i][j][k]=sc.next();
				}
		}
		
	}
		for(int i=0;i<arr.length;i++){
			System.out.println("inside the school no : " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println(" in class " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the name student no." +(k+1)+" is "+arr[i][j][k]);
			
				}
		}
		
	}
		
		
		
	}
}
