package demo.java;
import java.util.Scanner;
public class Scanner12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age :");
		int age=sc.nextInt();//it wpnt work because leftover
		sc.nextLine();//add this line therfore it can excutes
		System.out.print("enter your name :");
		String name=sc.nextLine();
	}

}
