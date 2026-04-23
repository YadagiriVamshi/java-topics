package SecondHalf;
class Animal12{
	void sound() {
		System.out.println("sounding");
	}
}
class Dog13 extends Animal12{ 
	void sound() {
		System.out.println("12345ty");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal12 d1=new Dog13();
		d1.sound();

	}

}
