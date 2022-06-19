package study.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream("E:\\OOPS\\data.suyog");  //READ OBJECT DESCERIALIZE
		ObjectInputStream oin = new ObjectInputStream(fin);
		 while(true)
		 {
			 try {
		Object obj2 = oin.readObject();
		System.out.println(obj2);
			 }catch(EOFException eof)
			 {
				 System.out.println("file reading complete");
				 break;
			 }
		 }
		
	}

}//end of ReadObjects
