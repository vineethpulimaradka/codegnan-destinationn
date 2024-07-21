package pattern;

import java.util.Scanner;

public class ArrayCode2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the class count");
	int cls=sc.nextInt();
	
	System.out.println("enter the student count");
	int stu=sc.nextInt();
	
	String arr[][] =new String [cls][stu];
	
	for (int i=0;i<cls;i++) {
		System.out.println("inside the class no."+(i+1));
		for(int j=0;j<stu;j++) {
			System.out.println("enter the name of the student no. "+(j+1));
			arr[i][j]=sc.next();
		}}
	for(int i=0;i<cls;i++) {
		System.out.println("inside the class no "+(i+1));
		for(int j=0;j<cls;j++) {
			System.out.println("the name of student no. "+(j+1)+"is = " +arr[i][j]);
		}
	}
}
}
