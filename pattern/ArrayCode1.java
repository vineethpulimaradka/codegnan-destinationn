package pattern;

import java.util.Scanner;

public class ArrayCode1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the student count");
	int n=sc.nextInt();
	
	
	//creating the array
	
	
	int arr[] =new int[n];
	
	//storing marks of each students
	
	for(int i=0;i<n;i++) {
		System.out.println("enter the marks of the student no." +(i+1));
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		System.out.println("the marks of the student no." +(i+1)+ "is ="+(arr[i]));
		
	}
}
}
