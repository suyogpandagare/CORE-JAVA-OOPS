package study.assignments;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain extends Student{

	public static void main(String[] args) throws IOException {

		ArrayList<Student> stud = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {

			stud.add(new Student("AAA", 50, 22, "abc"));
			stud.add(new Student("ABB", 70, 42, "arf"));
			stud.add(new Student("ACC", 90, 62, "ade"));
			System.out.println("Enter your choice: \n"
					+ "1. Add Student to List \n"
					+ "2. Remove Student from List \n"
					+ "3. Show All Students \n"
					+ "4. Show All Students on the basis of percentage \n"
					+ "5. Find a Student with Student Name \n"
					+ "6. Save All Student details in the File \n"
					+ "7. Quit");

			choice  = sc.nextInt();

			switch(choice) {

			case 1: {
				System.out.println("Enter name of Student: \n"
						+ "Percentage: \n"
						+ "Roll No: \n"
						+ "Address: ");

				sc.nextLine();
				String name = sc.nextLine();
				double percentage = sc.nextDouble();
				int rollNo = sc.nextInt();
				sc.nextLine();
				String address = sc.nextLine();

				stud.add(new Student(name, percentage, rollNo, address));

				System.out.println("Student Added Successfully..");
				break;
			}

			case 2: {
				System.out.println();
				System.out.println("Enter Student Name to remove: ");
				sc.nextLine();
				String name = sc.nextLine();
				for (int i = 0; i < stud.size(); i++) {
					if(stud.get(i).getStudentName().equals(name))
					{
						stud.remove(i);
					}
				}

				break;
			}

			case 3: {

				if(stud.isEmpty())
					System.out.println("No Student In List...!!");
				else {
					Iterator<Student> itr = stud.iterator();

					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
				}
				break;
			}

			case 4: {

				Collections.sort(stud);
				for (Student student : stud) {
					System.out.println(student);
				}
				break;
			}

			case 5: {
				System.out.println("Enter a Name to Search: ");
				sc.nextLine();
				String name = sc.nextLine();

				for (int i = 0; i < stud.size(); i++) {
					if(stud.get(i).getStudentName().equals(name))
					{
						System.out.println(stud.get(i));
					}
					else
						System.out.println("Student not Found");
				}

				break;
			}

			case 6: {

				FileOutputStream fout = new FileOutputStream("E:\\OOPS\\Student.txt",true);
				ObjectOutputStream p = new ObjectOutputStream(fout);

				p.writeObject("AAA, 50, 22, abc");
				p.writeObject("ABB, 70, 42, arf");
				p.writeObject("ACC, 90, 62, ade");

				p.flush();
				p.close();

				FileInputStream fin = new FileInputStream("E:\\OOPS\\Student.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
				while(true)
				{
					try {
						Object obj = oin.readObject();
						System.out.println(obj);
					} catch (ClassNotFoundException | EOFException e) {

						System.out.println("file reading complete");
						//e.printStackTrace();
						break;
					}

				}//while end
			}

			case 7: {
				break;
			}


			}//end of switch

		}while(choice != 6);
	}//end of main



}
