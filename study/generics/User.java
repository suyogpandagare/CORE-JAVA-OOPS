package study.generics;

import javax.swing.Popup;

import study.hasa.MyDate;

public class User {

	public static void main(String[] args) {
		
		Integer []arr = new Integer [3];
		
		//Integer is the actual type parameter
		MyStack<Integer> stack = new MyStack<Integer>(arr);
		stack.push(20);
		stack.push(30);
		stack.push(40);          //String isa Object so no error at compile time 
		
		add(stack);
		System.out.println();
		
		//MyDate is the actual type parameter
		MyStack<MyDate> stack2 = new MyStack<MyDate>(new MyDate[2]);
		stack2.push(new MyDate(1, 1, 2012));
		stack2.show();
		
		//Thread is the actual type parameter
		MyStack<Thread> stack3 = new MyStack<Thread>(new Thread [2]);
		stack3.push(new Thread());
		stack3.show();
		
	}
	
	public static void add(MyStack<Integer> st)
	{
		int sum= 0;
		sum = sum + st.pop();     //but here String obj cannot be type casted to Integer i.w.ClassCastExceeeeeption is showing
		sum = sum + st.pop();
		sum = sum + st.pop(); 
		
		System.out.println("sum = "+sum);
		
		
	}
}


/*case 1=> sum = 90
 * 
 * Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
at study.generics.User.add(User.java:24)
at study.generics.User.main(User.java:16)*/








