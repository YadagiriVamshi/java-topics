package SecondHalf;
class Animal1{
	void eat() {
		System.out.println("eating");
	}
}
class Dog1 extends Animal{
	void dogii() {
		System.out.println("doging");
	}
}
class Cat extends Animal{
	void catii() {
		System.out.println("catiing");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.catii();
		c1.eat();

	}

}
