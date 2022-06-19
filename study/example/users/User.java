package study.example.users;

import study.example.Delta;

public class User {

	public static void test1() 
	{
		Delta d1 = new Delta();   //As it is public so also acessible in other packages
		//Delta d2 = new Delta("Suyog");   //as this is private so not visible in this package 
		//Delta d3 = new Delta(17);     //as this is default scope so not accessible in other packages
	}
}
