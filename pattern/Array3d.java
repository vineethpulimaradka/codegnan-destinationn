package pattern;

import java.util.Scanner;

public class Array3d {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the school count");
		int sch=sc.nextInt();
		
		System.out.println("enter the class count");
		int cls=sc.nextInt();
		
		System.out.println("enter the student count");
		int stu=sc.nextInt();
		sc.nextLine();
		
		String arr[][][] =new String[sch][cls][stu];
		
		
		
		/*for(int i=0;i<cls;i++) {
			System.out.println(" enter the no. of students in class "+(i+1));
			arr[i]=new String[sc.nextInt()];
			
		}*/
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("in school no :" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" in class " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter name of the student "+(k+1));
				
			
			arr[i][j][k]=sc.nextLine();
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


