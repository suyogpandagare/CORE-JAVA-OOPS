package study.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fout = new FileOutputStream("E:\\OOPS\\data.suyog",true);
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		//Object obj = new Object();
		
		Data obj = new Data();
		obj.value=100;
		obj.desc = "century";
		oout.writeObject(obj);  //SCERIALIZE
		obj = new Data();
		obj.value =  200;
		obj.desc = "double century";
		oout.writeObject(obj);
		
		oout.flush();
		oout.close();
		
		
	}

}//end of SaveObjects

class Data implements Serializable
{
	public static final long serialVersionUID=9l;
	
	 int value;
	String desc="";
	
	
	@Override
	public String toString() {
		return "Data [value=" + value + ", desc=" + desc + "]";
	}
	
	
}
