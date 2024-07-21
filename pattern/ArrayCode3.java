package pattern;

import java.util.Scanner;

public class ArrayCode3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the class count");
		int cls=sc.nextInt();
	
		String arr[][] =new String [cls][];
		
		//collecting student count
		
		for (int i=0;i<cls;i++) {
			System.out.println("enter the student count inside the class "+(i+1));
			
			arr[i] =new String[sc.nextInt()];
		}
		
		for (int i=0;i<cls;i++) {
			System.out.println("inside the class no."+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the name of the student no. "+(j+1));
				arr[i][j]=sc.next();
			}}
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("inside class no."+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("the name of student no."+(j+1)+"is = " +arr[i][j]);
			}
		}
	
	
	}
	
	
	
}
