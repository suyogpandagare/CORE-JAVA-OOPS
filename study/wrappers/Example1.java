package study.wrappers;

public class Example1 {

	public static void main(String[] args) {
		
		Integer obj = new Integer(34);  //Wrap 34 into obj , Boxing
		
		Integer obj2 = 44;   //AutoBoxing
		
		Character chobj1 = new Character('P');
		Character chobj2 = 'W';	
		
		Boolean flag1 = false;  //Autoboxing-object will point to heap memory where value is wrapped
		boolean flag = true;  //Primitive- this will create on stack 
		Boolean flag2 = new Boolean("true"); 
		
		Float fobj = new Float(23.33);
		Float fobj1 = 23.33f;
		
		byte byobj1 = 11;
		Byte byobj = new Byte((byte) 44);
		
		Long lobj = new Long(323323);
		long lobj1 = 23423423;
	
		//we have to 
		Short s = new Short((short) 15);
		
		//UNBOXING
		
		int x = obj;  //This is auto unboxing value in object is assigned to x
		char ch = chobj1;
		boolean b = flag1;
		float f = fobj1;
		byte by = byobj1;
		long l = lobj1;
		
	}
}
















