package SecondHalf;

public class Polymorpism {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorpism p1=new Polymorpism();
		System.out.println(p1.add(12, 34));
		System.out.println(p1.add(12, 23,23));

	}

}
