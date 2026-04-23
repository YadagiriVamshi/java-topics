package SecondHalf;
abstract class Vamshi{
	abstract void man();
	void view1() {
		System.out.println("viewing");
	}
}
class Hero extends Vamshi{
	void man() {
		System.out.println("hii");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vamshi g1=new Hero();
		g1.man();
		g1.view1();

	}

}
