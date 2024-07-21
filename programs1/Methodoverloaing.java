package programs1;

class Calculator{
	
	int add(int a,int b) {
		return a+b;
				
	}
	
	float add(float a,float b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
				
	}
	float add(float a,float b,float c) {
		return a+b+c;
	}
	
	double add(double a,double b,double c) {
		return a+b+c;
	}
	
	float add(int a,int b,float c) {
		return a+b+c;
	}
	
	double add(int a,float b,double c) {
		return a+b+c;
	}
	
	double add(float a,double b) {
		return a+b;
	}
	
	double add(int a,double b) {
		return a+b;
	}
	
	double add(double a,int b) {
		return a+b;
	}
}
public class Methodoverloaing {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	int a=10,b=20,c=30;
	float p=10.4f,q=20.5f,r=30.2f;
	double m=10.4657,n=20.3848,o=30.787;
	System.out.println(c1.add(a, b));
	System.out.println(c1.add(a, b, c));
	System.out.println(c1.add(a, b,p));
	System.out.println(c1.add(p, b,m));
}
}
