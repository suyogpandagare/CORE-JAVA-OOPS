package study.wrappers;

public class Example3 {

	public static void main(String[] args) {
      //Integer constant pool is created only for  -128 to 127
		
//		Integer i1 = 50;
//		Integer i2 = 50;
		
		
		//Integer i1 = 500;  //new object is created ...this is creating object by AutoBoxing
		//Integer i2 = 500;  //new object is created
		
		Integer i1 = Integer.valueOf(127);  //valueOf may forces the use of constsnt pool
		Integer i2 = Integer.valueOf(127);
		
		if(i1==i2)
		{
			System.out.println("both i1 and i2 are referencing same object due to constant pool");
		}
		else
			System.out.println("i1 and i2 are refderencing different objects");
	
		i1++;  // creates a new object , Integer is Immutable
	
	
	
	
	
	}

}
