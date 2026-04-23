package demo.java;
class animal{
	static void view() {
		System.out.println("viewing");
	}
}

public class Staticmethod {
//	static void greet() {
//		System.out.println("greeting");
//	}
	public static void main(String[] args) {
//		greet();
		animal.view();
	}

}
