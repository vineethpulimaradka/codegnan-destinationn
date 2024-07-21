package pattern;

import java.util.Scanner;

public class PatternAtoZ {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int n=sc.nextInt(); */
			
		System.out.println();
				
				int n=7;
				
			for(int i=0;i<n;i++) {
			
				// A code
				
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<(n/2) && j!=0 ) || (j==0 && i!=0) || (j==(n/2) && i!=0) || (i==(n/2) && j<=(n/2))) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
					
				//B code
					
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<(n/2)  ) || (j==0 && i!=0) || (j==(n/2) && i!=0) && i!=n/2 && i!=(n-1) || (i==(n/2) && j<(n/2)) || i==(n-1) && j<n/2) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
			
				//C code
				
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<(n/2) && j!=0 ) || (j==0 && i!=0 &i!=n-1)  || j!=0 && i==(n-1) && j<(n/2)) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
	
				
				//D code
				
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<(n/2)  ) || (j==0 && i!=0)  || (i==(n-1) && j<(n/2)) || j==n/2 && i!=0 && i!=n-1) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//E c0de
				
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<=(n/2)  ) || (j==0 && i!=0) || (i==(n/2) && j<=(n/2)) || i==(n-1) &&j<=(n/2)) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//F C0de
				
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<=(n/2)  ) || (j==0 && i!=0)  || (i==(n/2) && j<=(n/2))) 
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//G code
				for(int j=0;j<n;j++)
				{
					if((i==0 && j<=(n/2)  ) || (j==0 ) || i==(n-1) && j<=(n/4) || j==n/4 && i>=n/2 || i==n/2 && j>n/4 && j<=n/2 || j==n/2 && i>n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//H code
				
				for(int j=0;j<n;j++)
				{
					if( (j==0 )   || i==n/2 && j<=n/2 || j==n/2 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}

				//I code
				
				for(int j=0;j<n;j++)
				{
					if(j==n/4 || i==0 && j<n/2 || i==n-1 && j<n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//J code
				
				for(int j=0;j<n;j++)
				{
					if(j==n/4 || i==0 && j<n/2 || i==n-1 && j<n/4 || j==0 && i>n/2 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//K Code
				
				for(int j=0;j<n;j++)
				{
					if( j==0 || i+j==n/2 || i-j==n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//L code
				
				for(int j=0;j<n;j++)
				{
					if( j==0 || i==n-1 && j<=n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//M code
				
				for(int j=0;j<n;j++)
				{
					if( j==0 || i==j && j<n/2 ||j==(n-1)  || i+j==n-1 && j>=n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//N code
				
				System.out.print("		");
				
				for(int j=0;j<n;j++)
				{
					if( j==0 || i==j  ||j==(n-1)  )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//O code
				
				System.out.print("		");
				
				for(int j=0;j<n;j++)
				{
					if( j==0 && i!=0 && i!=n-1||j==(n/2)&& i!=0 && i!=n-1|| j!=0 && i==0 && j<n/2 || i==n-1 && j<n/2 && j !=0)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//P code
				
				for(int j=0;j<n;j++)
				{
					if( j==0||j==(n/2)&& i!=0 && i<n/2|| j!=0 && i==0 && j<n/2 || i==n/2 && j<n/2 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//Q code
				
				for(int j=0;j<n;j++)
				{
					if( j==0 && i!=0 && i<3*n/4 || i==0 && j<3*n/4 && j!=0 || j==3*n/4 && i!=0 && i<3*n/4 || i==3*n/4 && j<3*n/4 && j!=0 || i==j && j>=n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//R code
				
				System.out.print("	 ");
				for(int j=0;j<n;j++)
				{
					if( j==0||j==(n/2)&& i!=0 && i<n/2|| j!=0 && i==0 && j<n/2 || i==n/2 && j<n/2 || i-j==n/2 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//S code
				
				for(int j=0;j<n;j++)
				{
					if( i==0 && j!=0 && j<=n/2 || j==0 && i!=0 && i<n/2 || i==n/2 && j!=0 && j<n/2 || j==n/2 && i>n/2 && i!=n-1 || i==n-1 && j<n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//T code
				
				for(int j=0;j<n;j++)
				{
					if( j==n/4 || i==0 &&j<n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//U code
				
				for(int j=0;j<n;j++)
				{
					if( j==0 && i!=n-1 || j==n/2 && i!=n-1 || i==n-1 && j<n/2 && j!=0 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//V code
				
				
				for(int j=0;j<n;j++)
				{
					if( j==0 && i<=n/2|| j==n-1 && i<=n/2 || i-j==n/2 || i+j==(n/2)+(n-1))
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//W code
				System.out.print("		");
				for(int j=0;j<n;j++)
				{
					if( j==0 || j==n-1 || i==j && i>=n/2 || i+j==n-1 && j<n/2)
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//X code 
				
				System.out.print("		");
				for(int j=0;j<n;j++)
				{
					if(  i==j  || i+j==n-1 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				//Y code 
				
				System.out.print("		");
				for(int j=0;j<n;j++)
				{
					if( i==j && j<n/2 || i+j==n-1 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				//Z code
				
				System.out.print("		");
				for(int j=0;j<n;j++)
				{
					if( i==0 || i+j==n-1 || i==n-1 )
						
					 
					{
						System.out.print("* ");
					}
					
					else {
						System.out.print("  ");
					}
				}
				
				
				System.out.println();
			}
			}
	
	
}
