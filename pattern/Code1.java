
package pattern;
import java.util.Scanner;

class Code1
{
public static void main(String args[])
{
int count=1;
Scanner sc=new Scanner(System.in);
System.out.print("enter the size");
int n=sc.nextInt();

for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
    System.out.print(" ");
   
}
for(int j=1;j<=2*i-1;j++){
System.out.print(count+" ");
count++;

}
System.out.println();
}
}
}