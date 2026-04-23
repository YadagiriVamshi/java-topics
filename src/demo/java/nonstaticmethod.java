package demo.java;
//class vamshi{
//	void hello() {
//		System.out.println("hello all");
//	}
//}

public class nonstaticmethod {
	void hello() {
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		nonstaticmethod v1=new nonstaticmethod();
		v1.hello();
	}

}
