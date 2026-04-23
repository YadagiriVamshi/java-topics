package SecondHalf;

public class Practice {
	public static void main(String[] args) {
		try {
//		int a=10;
//		int b=0;
//		int result=a/b;
			int arr[]=new int[3];
			arr[5]=10;
			}
		catch(ArithmeticException e) {
			System.out.println("done");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
		
		System.out.println("yadagiri Vamshi");
	}
	}

}
