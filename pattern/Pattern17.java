package pattern;

import java.util.Scanner;

class Pattern17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter the size");

int n=sc.nextInt();

for(int i=1;i<=n;i++){

    for(int j=n;j>=i;j--){



    System.out.print("# ");
}
for(int j=1;j<=2*i-1;j++){
    System.out.print("* ");
}

System.out.println();
}
}
}