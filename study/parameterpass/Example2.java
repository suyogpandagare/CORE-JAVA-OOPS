package study.parameterpass;

public class Example2 {

	public static void main(String[] args) {

		//array is a object in java
		int[]arr = {100, 200};
		System.out.println("before"+ "arr[0]"+arr[0] + "arr[1]"+arr[1]);
		increment(arr);
		System.out.println("before"+ "arr[0]"+arr[0] + "arr[1]"+arr[1]);
	
	
	}

	public static void increment(int []arr)
	{
		arr[0]++;
		arr[1]++;
	}
}
