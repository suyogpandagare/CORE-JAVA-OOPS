package study.another;

import study.scopes.Alpha;

public class Gamma {

	public static void test3()
	{
		Alpha a2 = new Alpha();
		//a2.data=100;    //data is private cannot be accessed in another class
		//a2.data2=100;     //data2 same package me nahi hai t.w.not visible data2 is default scope so not accessible outside the package
		a2.data3=100;    //data3 is public so accessible in every package
	
		//a2.show1();  //as the method is private the scope is limited to its class only so not visible in this class
		//a2.show2();  //as default scope in not visible in other packages so not visible in this package
		a2.show3();
	}
}
