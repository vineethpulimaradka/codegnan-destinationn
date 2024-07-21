package programs1;

class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	void setdata(String a,String b,int c,int d,String e) {
		name=a;
		color=b;
		cost=c;
		age=d;
		breed=e;
	}
	
	void getdata() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
	}
	
}


public class Encapsulation {
public static void main(String[] args) {
	
	Dog d1=new Dog();
	d1.setdata("Rubby", "White", 7000, 1, "Mudolla");
	
	d1.getdata();
	
	
}
}
