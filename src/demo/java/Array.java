package demo.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[3]=3;
		arr[2]=4;
		arr[4]=5;
		System.out.println(arr[1]);
		int[] arr1= {1,2,3,4,5};
		System.out.println(arr1[4]);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
