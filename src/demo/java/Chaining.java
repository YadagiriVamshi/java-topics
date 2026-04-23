package demo.java;

public class Chaining {
	int age;
	String name;
	Chaining(int a,String n){
		this.age=a;
		this.name=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining c1=new Chaining(23,"vamshi");
		System.out.print(c1.age);
		System.out.print(c1.name);
	}

}
