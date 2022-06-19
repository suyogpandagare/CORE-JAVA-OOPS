package study.generics;

public class TestGenerics {

	public static void main(String[] args) {

		Object [] arr = new Object[5];
		
		arr[0] = 40; //int==>auto boxing => Integer ,and Integer is a object
		arr[4] = "hello";//String is a object
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//arr[4] = 'h'; //auto boxing character
		//int x = (int)'f'; //this is typecasting
		
		int sum = 0;
		for(int i=0; i<5; i++)
		{
			System.out.println("adding "+arr[i]);
			sum  = sum + (Integer)arr[i];  //downcasting + unboxing
		}
		
		System.out.println(sum);
		
	}

}
