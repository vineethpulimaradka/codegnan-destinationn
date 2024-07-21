package pattern;

import java.util.Scanner;

public class HackerRankArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the count of the languages in which surajs production house is producing the movie");
	
	int lang=sc.nextInt();
	
	System.out.println("Enter the catagories in which movies are being produced by sursj's production house ");
	
	int cat =sc.nextInt();
	System.out.println("Enter the count of movies produced in each catagory of language by suraj's production house");
	
	int mov =sc.nextInt();
	
	long arr[][][] =new long[lang][cat][mov];
	
	long overal_collection=0;
	
	//loop for collecting the collection made by each movie
	
	for(int i=0;i<arr.length;i++) {
		System.out.println("**********Language no:"+(i+1)+"***********");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("**********catagory no:"+(j+1)+"***********");
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the collection of movie no. "+(k+1));
				arr[i][j][k]=sc.nextLong();
			}
			
		}
	}
	
	//long for displaying the collection made by each movie
	for(int i=0;i<arr.length;i++) {
		System.out.println("**********Language no:"+(i+1)+"***********");
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("**********catagory no:"+(j+1)+"***********");
		
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("collection of movie no."+arr[i][j][k]);
				overal_collection=overal_collection+arr[i][j][k];
			}}}
	
	if(overal_collection>6000000000l) {
		System.out.println("sooraj is in profitable side");
		System.out.println("the profit made by suraj is="+(overal_collection-6000000000l));
				
				
			}
	else {
		
		System.out.println("sooraj is under loss ");
	    System.out.println("the loss increased by sooraj is = " + (6000000000l-overal_collection));
			
		}
		
	}
	
}

