package pattern;

public class PatternY {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt(); */
		
			int n=11;
			
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				if(i==j && i<=(n/2) ||i+j==(n-1)) 
					
				 
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
