package demo.java;
class Parent {
	Parent(){
	System.out.println("parent class");
}
}
class child extends Parent{
	child(){
	super();
	System.out.println("child class");	
}
}

public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child n=new child();
//		n.child1();
		
		

	}
}
