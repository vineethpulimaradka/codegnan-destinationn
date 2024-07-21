package programs1;


class Plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	
	void fly() {
		System.out.println("plane flying");
	}
	
	void land() {
		System.out.println("plane has landed ");
	}}
	
	class Cargoplane extends Plane{
		
		void carrygoods() {
			System.out.println("cargo plane is carrying goods");
		}
		
		void fly() {
			System.out.println("cargo plane is flying in the the lower height ");
		}
		
		
	}
	
	class Passengerplane extends Plane{
		
		void carryhumans() {
			System.out.println("passenger plane carry humans");
		}
		
		void fly() {
			System.out.println("passenger plane is flying at medium height ");
		}
	}
	
class Fighterplane extends Plane{
		
		void fly() {
			System.out.println("Fighter plane flying at greater height");
		}
		
		void carryweapons() {
			System.out.println("fighter plane carrying weapons");
		}
	}


public class Inheritcode2 {
	
	public static void main(String[] args) {
		
		Cargoplane cp=new Cargoplane();
		Passengerplane pp=new Passengerplane();
		Fighterplane fp=new Fighterplane();
		Plane ref;
		
		System.out.println("----------------cargo plane-----------------");
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		
		cp.carrygoods();
		
		System.out.println("*********************************************");
		
		System.out.println("----------------Passenger plane--------------");
		
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		
		pp.carryhumans();		

		System.out.println("*********************************************");
		
		System.out.println("----------------Fighter Plane----------------");
		
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		
		fp.carryweapons();		

		System.out.println("*********************************************");
		
		
		
		System.out.println("*********************************************");
		
		

	}

}

