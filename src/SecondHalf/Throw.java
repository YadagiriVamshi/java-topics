package SecondHalf;

public class Throw {
	public static void main(String[] args) {
		int age=15;//if cond true it runs if not throws exception
		
		if(age<18) {
			throw new ArithmeticException("you are not eligible for vote");
		}
		System.out.println("you are eligible for vote");
		
	}

}
