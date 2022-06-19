package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Sub obj = new Sub();
		obj.x = 888;
		obj.y = 999;
		
		FileOutputStream fout = new FileOutputStream("E:\\OOPS\\test.su");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		
		oout.writeObject(obj);
		oout.flush();
		oout.close();
		
		fout.close();
		
		FileInputStream fin = new FileInputStream("E:\\OOPS\\test.su");  //READ OBJECT DESCERIALIZE
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Sub obj2 = (Sub) oin.readObject();
		System.out.println("x="+obj2.x+"y="+obj2.y);
		
	}

}

class Test implements Serializable
{
	int x;
}

class Sub extends Test implements Serializable
{
	int y;
}