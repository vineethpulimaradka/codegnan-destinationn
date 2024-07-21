package programs1;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}


class Square extends Shapes{
	private double side;
	
	void collect() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the side value of the square");
		side=sc.nextDouble();
		
	}
	
	void calculate() {
		
		area=side*side;
	}
}

class Circle extends Shapes{
	private double radius;
	private double pi=3.14768;
	
	void collect() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the radius value of the circle");
		radius=sc.nextDouble();
		
	}
	
	void calculate() {
		
		area=pi*radius*radius;
	}
}


class Rectangle extends Shapes{
	private double l,b;
	
	void collect() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length value of the rectangle");
		l=sc.nextDouble();
		
		System.out.println("enter the breadth value of the rectangle");
		b=sc.nextDouble();
		
	}
	
	void calculate() {
		
		area=l*b;
	}
}

class Geometry{
	void permit(Shapes s) {
		
		s.collect();
		s.calculate();
		s.display();
		
	}
}

public class Oopsall {
	public static void main(String[] args) {
		Square sq=new Square();
		Circle cr=new Circle();
		Rectangle rc=new Rectangle();
		Geometry gm=new Geometry();
		System.out.println("the square oops");
		gm.permit(sq);
		System.out.println("****************");
		System.out.println("the circle oops");
		System.out.println("****************");
		gm.permit(cr);
		System.out.println("the rectangle oops");
		System.out.println("****************");
		gm.permit(rc);
		
	}

}
