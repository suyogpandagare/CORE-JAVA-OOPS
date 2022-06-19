package study.interfaces;

interface T2
{
	void f2();
}

interface T1 extends T2
{
	void f1();
}

class C1 implements T1
{

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}

interface T4
{
	void f4();
	default void f5()
	{
		System.out.println("default method of T4");
	}
}

interface T3 extends T2 ,T4
{
	void f3();
}

class C2 implements T3
{

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}
	
}

class C3 implements T4
{

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}
	
}

interface T5
{
	default void f5()
	{
		System.out.println("default of T5");
	}
}

class C4 implements T4 ,T5
{

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f5() {
		// TODO Auto-generated method stub
		T4.super.f5();
		T5.super.f5();
		System.out.println("f5 of C4");
	}
	
}











