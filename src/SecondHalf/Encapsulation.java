package SecondHalf;

class Cap {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name=n;
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cap c1=new Cap();
		c1.setAge(23);
		c1.setName("vamshiyadav");
		System.out.println(c1.getAge());
		System.out.println(c1.getName());
	}
}