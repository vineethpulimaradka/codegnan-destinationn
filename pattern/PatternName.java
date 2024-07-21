package pattern;

public class PatternName {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt(); */
		
			int n=7;
			
			System.out.println();
			
		for(int i=0;i<n;i++) {
			
			//V code
			
			for(int j=0;j<n;j++)
			{
				if(j==0 && i<=n/2 || j==n-1 && i<=n/2 ||i-j ==n/2 || i+j==(n-1)+(n/2) ) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			//I code
			
			System.out.print("		");
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<n/2 || j==n/4 || i==n-1 && j<n/2) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			//N code
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j ) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
             //E code
			
			System.out.print("		");
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<n/2 || j==0 || i==n/2 && j<n/2 || i==n-1 && j<n/2 ) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
            //E code
			
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<n/2 || j==0 || i==n/2 && j<n/2 || i==n-1 && j<n/2 ) 
					
				 
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
				if(i==0 && j<n/2 || j==n/4 ) 
					
				 
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
				if(j==0  || j==n/2 || i==n/2 && j<n/2 ) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			//*
			
			for(int j=0;j<n;j++)
			{
				if(i==n/2 &&j==n/2) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			//P
			
			for(int j=0;j<n;j++)
			{
				if(j==0 && i!=0 || j==n/2 && j!=0 && i!=0 && i<n/2  || i==0 && j<n/2  || i==n/2 && j<n/2 ) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			//*
			
			for(int j=0;j<n;j++)
			{
				if(i==n/2 && j==n/2) 
					
				 
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			
			
			
			//L
			
			for(int j=0;j<n;j++)
			{
				if(j==0  || i==n-1 && j<=n/2 ) 
					
				 
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
