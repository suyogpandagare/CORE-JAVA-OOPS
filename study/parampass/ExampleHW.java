package study.parampass;

public class ExampleHW {

	public static void main(String[] args) {

		Wrapper x = new Wrapper();
		Wrapper y = new Wrapper();
		
		x.value = 20;
		y.value = 45;
		
		System.out.println("Before" + x.value +", "+ y.value);
		
		swap(x,y);
		
		System.out.println("After" + x.value +", "+ y.value);
		
	}

	public static void swap(Wrapper x, Wrapper y)
	{
		Wrapper tmp = new Wrapper();
		tmp.value = x.value;
		x.value = y.value;
		y.value = tmp.value;
	}
}

class Wrapper{

	int value;
}
