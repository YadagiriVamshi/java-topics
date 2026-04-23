package demo.java;

public class Stringbuffer1 {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("vamshi");
		sb.append("hello");
		sb.insert(3,"yvy");
		sb.delete(1, 9);
		System.out.println(sb);
		//StringBuffer sb=new StringBuffer("aishu");
	}

}
