package study.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader fin = new FileReader("E:\\OOPS\\poem.txt");

		BufferedReader reader = new BufferedReader(fin);


				while(true)
				{
					String filedata = reader.readLine();
					if(filedata == null)  break;
					System.out.println(filedata);
				}


	}

}
