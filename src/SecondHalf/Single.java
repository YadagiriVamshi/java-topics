package SecondHalf;
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void view() {
		System.out.println("viewing");
	}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.view();
		d.eat();

	}

}
