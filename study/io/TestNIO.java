package study.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestNIO {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("E:\\OOPS\\poem.txt");
		
		Files.createFile(p); //creating file
		
		String s1 = "Wooods are lovely dark and green";
		Files.write(p, s1.getBytes(), StandardOpenOption.APPEND);
		
		List<String> lines = Files.readAllLines(p);
		for(String s : lines)
		{
			System.out.println(s);
		}
		
		Files.delete(p);    //program se file delete kr de..no file now available in OOPS
		

		
	}

}
