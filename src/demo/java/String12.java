package demo.java;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vamshiyadav";//scp(string constant pool)
		String name1=new String("vamshiyadav");//heap
		System.out.println(name==name1);//reference
		System.out.println(name.equals(name1));//actual context
		

	}

}
