package study.isa;

public class Test {

	public static void main(String[] args) {

		//D obj = new D();
		//A obj = new A();
		//B obj = new B();
		//E obj = new E();
		
		C obj  = new C(100, 200, 300);
		System.out.println(obj.a+ " "+ obj.b+ " "+ obj.c);
	}

}//end of Test class

//CREATING HIERARCHY
class A
{
	int a;
	A(){ System.out.println("A is created");}
	A(int a)
	{
		this.a = a;
	}
}

class B extends A    
{
	int b;
	
	B(){System.out.println("B is created");}
	B(int a, int b)
	{
		super(a);   //super parameterised constructor will get called
		this.b = b;
	}
}

class C extends B  //A-B-C  3 class ke object banenge
{
	int c;
	C(){System.out.println("C is created");}
	
	C(int n1,int n2,int n3)
	{
		super(n2,n3);     //this will call p.c of class B and then p.c of class A
		this.c = n1;
	}
}

class D extends C    //D class ka object matleb D ke uper ke saare clases ke object bannenge
{
	D(){System.out.println("D is created");}
}
class E extends B
{
	E(){ System.out.println("E is created");}
}
//We Have Created Multilevel hIERARCHY 















