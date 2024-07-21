package programs1;

import java.util.Scanner;

class Dog1{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
	 this.name=name;
	}
	
	
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
	 this.color=color;
	}
	
	
	public int getCost() {
		return cost;
		
	}
	public void setCost(int cost) {
	 this.cost=cost;
	}
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
	 this.age=age;
	}
	
	public String getBreed() {
		return breed;
		
	}
	public void setBreed(String breed) {
	 this.breed=breed;
	}
	
	
	
}
public class Indepngettersetter {
public static void main(String[] args) {
	Dog1 d1=new Dog1();
	
	
	
	
	d1.setName("tommy");
	d1.setColor("white");
	
	System.out.println(d1.getName());
	System.out.println(d1.getColor());
}
}
