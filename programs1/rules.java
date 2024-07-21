package programs1;



import java.util.Scanner;

public interface rules{
	 void collect();
	 void calculate();
}

abstract class Shape2 implements rules{
	public double area;
	Scanner sc=new Scanner(System.in);
	void display() {
		System.out.println(area);
	}
	public void collect() {
		
	}
	public void calculate() {
		
	}
}
class Square2 extends Shape2 implements rules{
	private double side;
	public void collect() {
		System.out.println("Enter the value of side:");
		side=sc.nextInt();
	}
	public void calculate() {
		area=side*side;
	}
}
class Circle2 extends Shape2 implements rules{
	private final double pi=Math.PI;
	private double radi;
	public void collect() {
		System.out.println("Enter the value of radius:");
		radi=sc.nextDouble();
	}
	public void calculate() {
		area=pi*radi*radi;
	}
}
class Rectangle2 extends Shape2 implements rules{
	private double l,b;
	public void collect() {
		System.out.println("Enter the value of length:");
		l=sc.nextDouble();
		System.out.println("Enter the value of breadth:");
		b=sc.nextDouble();
	}
	public void calculate() {
		area=l*b;
	}
}
class Geometric2{
	void permit(Shape2 s) {
		s.collect();
		s.calculate();
		s.display();
	}
}

 class AllFourSame {
	public static void main(String[] args) {
		Shape2 sh=new Shape2() {
//			void display() {
//				System.out.println(area);
//			}
//			public void collect() {
//				
//			}
//			public void calculate() {
//				
//			}
		};
		Square2 sq=new Square2();
		Geometric2 g=new Geometric2();
		Rectangle2 r=new Rectangle2();
		Circle2 c=new Circle2();
		System.out.println("Square Operation!");
		g.permit(sq);
		System.out.println("Circle Operation!");
		g.permit(c);
		System.out.println("Rectangle Operation!");
		g.permit(r);
	}
}