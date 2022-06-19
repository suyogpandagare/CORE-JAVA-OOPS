package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.ControllerEventListener;

import study.hasa.MyDate;

public class GroceryStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<FoodProduct> fp = new ArrayList<FoodProduct>();

		fp.add(new FoodProduct("Chavyanprash","Dabar",new MyDate(12, 12, 2023),399,"Healthy",13,14,100,1000));
		fp.add(new FoodProduct("MuscleBlaze","MusB",new MyDate(12, 12, 2025),2500,"GymHolic",15,25,20,800));
		fp.add(new FoodProduct("Wafers","KurKure",new MyDate(1, 11, 2022),200,"RawPlant",10,25,300,2000));
		fp.add(new FoodProduct("Biscuit","Parle-G",new MyDate(4, 8, 2022),395,"Salty",13,14,100,1000));
		fp.add(new FoodProduct("Nutella","Tata",new MyDate(8, 5, 2024),393,"Tasety",13,14,100,1000));

		char choice;

		do {
			System.out.println();
			System.out.println("-------Enter your choice:-------- ");
			System.out.println("a. Show all FoodProduct names and cost\r\n" + 
					"b. Show all food products sorted by default ordering of expiry date\r\n" + 
					"c. Show all sorted by fatper\r\n" + 
					"d. Show all sorted by protein\r\n" + 
					"e. Show all sorted by cost\r\n" + 
					"f. Show product having minimum fatper\r\n" + 
					"g. Show product having max proteinper\r\n" + 
					"h. Quit");
			System.out.println("--------------------------------------");

			choice = sc.next().charAt(0);	

			switch(choice) {

			case 'a': {
				System.out.println("All Food Products ARE =>");
				show1(fp);
				break;

			}
			case 'b': {
				System.out.println("Products After Sorting By ExpiryDate =>");
				Collections.sort(fp);
				show(fp);
				break;
			}

			case 'c': {
				System.out.println("Products After Sorting By Fat Percentage =>");
				Collections.sort(fp, new FatComparator());
				show(fp);
				break;
			}

			case 'd': {
				System.out.println("Products After Sorting By Protein Percentage =>");
				Collections.sort(fp, new ProteinComparator());
				show(fp);
				break;
			}

			case 'e': {
				System.out.println("Products After Sorting By Cost =>");
				Collections.sort(fp, new CostComparator());
				show(fp);
				break;
			}

			case 'f': {
				System.out.println("Products With Minimum Fat Percentage =>");
				FoodProduct minfat = Collections.min(fp, new FatComparator());
				System.out.println(minfat);
				break;
			}

			case 'g': {
				System.out.println("Products With Maximum Protein Percentage =>");
				FoodProduct maxprotein = Collections.max(fp, new ProteinComparator());
				System.out.println(maxprotein);
				break;
			}

			case 'h': {
				System.out.println("Thank You ...!! Visit Again.. ");
				break;
			}
			}//end of switch


		}while(choice != 'h');

	}//end of main

	public static void show(List<FoodProduct> list)
	{
		Iterator<FoodProduct> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

	public static void show1(List<FoodProduct> list)
	{
		for (FoodProduct foodProduct : list) {
			System.out.println(foodProduct.getName()+ " "+foodProduct.getCost());
		}

	}


}//end of class

class FatComparator implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct arg0, FoodProduct arg1) {

		if(arg0.getFatPer() > arg1.getFatPer()) return 1;
		if(arg0.getFatPer() < arg1.getFatPer()) return -1;
		else
			return 0;
	}

}//end of class

class ProteinComparator implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct arg0, FoodProduct arg1) {

		if(arg0.getProteinPer() > arg1.getProteinPer()) return 1;
		if(arg0.getProteinPer() < arg1.getProteinPer()) return -1;
		else
			return 0;
	}

}//end of class

class CostComparator implements Comparator<FoodProduct>
{

	@Override
	public int compare(FoodProduct arg0, FoodProduct arg1) {

		if(arg0.getCost() > arg1.getCost()) return 1;
		if(arg0.getCost() < arg1.getCost()) return -1;
		else
			return 0;
	}

}//end of class









