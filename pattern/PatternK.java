package pattern;

public class PatternK {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt(); */
		
			int n=11;
			
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				if(j==0 || i+j==(n/2) || i-j==(n/2)) 
					
				 
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
