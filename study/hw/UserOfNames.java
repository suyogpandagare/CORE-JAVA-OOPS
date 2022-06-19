package study.hw;

import java.util.Scanner;

public class UserOfNames {

	public static void main(String[] args) {

		StudentNames nm = new StudentNames();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice:");
			System.out.println("1.Show All Names");
			System.out.println("2.Add Name");
			System.out.println("3.Get Name On Index");
			System.out.println("4.quit");

			int choice = sc.nextInt();
			switch(choice) {

			case 1: {
				nm.showAllNames();
				break;
			}

			case 2: {
				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();
				nm.addName(name);
				break;
			}

			case 3: {
				System.out.println("Enter the index");
				int index = sc.nextInt();
				nm.getNameOnIndex(index);
				break;
			}

			case 4: {
				return;
			}
			}//switch end

		}

	}

}
