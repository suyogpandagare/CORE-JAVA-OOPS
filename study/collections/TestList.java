package study.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		
		//ArrayList<String> al = new ArrayList<String>();
		
		//LinkedList<String> al =new LinkedList<String>();
		
		//Stack<String> al = new Stack<String>();
		
		Vector<String> al = new Vector<String>();
		al.add("red");
		al.add("yellow");
		al.add("green");
		al.add("blue");
		al.add("red");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		
		
	}
}
