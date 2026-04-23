package demo.java;

public class Constructors {
//	Constructors(){
//	}default
//	int a=10;
//	String name="vamshiyadav";
	int age;
	String name;
	Constructors(int a,String n){
		age=a;
		name=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructors n=new Constructors();
//		System.out.println(n.a);
//		System.out.println(n.name);
		Constructors n=new Constructors(12,"vamshi");
		System.out.println(n.age);
		System.out.println(n.name);
		
	}

}
