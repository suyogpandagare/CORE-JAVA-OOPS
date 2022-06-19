package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserOfBDayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BirthdayList list = new BirthdayList(new ArrayList<String>());
		
		
		int choice;
		
		do {
			System.out.println("Enter your choice\n"
					+ "1. Show Guest List\n"
					+ "2. Add Multiple Names\n"
					+ "3. Remove a Name\n"
					+ "4. Add a Name\n"
					+ "5. Clear list\n"
					+ "6. Is the Name in the List\n"
					+ "7. Total Guests\n"
					+ "8. Quit");

			choice = sc.nextInt();

			switch(choice) {

			case 1: {
				
				try {
					list.showGuestList();
				} catch (NoGuestException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
			case 2: {
				System.out.println("Enter Comma Seperated Multiple Names : ");
				String name = sc.next();
				String []names = name.split(",");
				
				//Collections.addAll(list, names);
				System.out.println("Names Added Successfully");
				
				break;
			}

			case 3: {
				System.out.println("Enter a name: ");
				String name = sc.next();
				list.removeName(name);
				break;
			}

			case 4: {
				System.out.println("Enter the name: ");
				String name = sc.next().toUpperCase();
				list.addNames(name);
				break;
			}

			case 5: {
				list.clearList();
				break;
			}

			case 6: {
				System.out.println("Enter the name to search: ");
				String name = sc.next();
				if(list.isTheNameInTheList(name))
					System.out.println("Name is present in list");
				else
					System.out.println("Name is not present in list");
				break;
			}

			case 7: {
				System.out.println(list.totalGuests());
				break;
			}

			case 8: {
				System.out.println("Thank you");
				break;
			}
			
			}//end of switch case

		}while(choice != 8);
	}

}
