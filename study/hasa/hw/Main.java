package study.hasa.hw;

import java.util.Scanner;

import study.hasa.MyDate;


public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		Product[] p = new Product[10];
		p[0] = new Product("LifeGood","Fridge",5000,new MyDate(12,12,2023));
		p[1] = new Product("HondaCity","Car",500000,new MyDate(12,12,2050));
		p[2] = new Product("Onida","TV",5000,new MyDate(12,12,2025));
		p[3] = new Product("Whirlpool","Washing Machine",7000,new MyDate(12,12,2030));
		p[4] = new Product("Apple","Watch",25000,new MyDate(11,4,2030));
		p[5] = new Product("Lenovo","Laptop",50000,new MyDate(17,5,2030));
		p[6] = new Product("HondaCity","Car",500000,new MyDate(12,12,2050));
		p[7] = new Product("Apple","Mobile",100000,new MyDate(22,10,2030));
		p[8] = new Product("Maruti","Car",500000,new MyDate(15,12,2035));
		p[9] = new Product("Suzuki","Car",200000,new MyDate(16,3,2035));

		int choice;
		do {
			System.out.println("1.Modify A Product: ");
			System.out.println("2.Show All Products: ");
			System.out.println("3.Show Total Cost Of All Products: ");
			System.out.println("4.Show Names Of All Products: ");
			System.out.println("5.Remove A Product: ");
			System.out.println("6.Exit..!");

			choice  = sc.nextInt();

			switch(choice) {

			case 1: {
				modifyProduct(p);
				break;

			}

			case 2: {
				showAllProduct(p);
				break;
			}

			case 3: {
				showTotalCostOfAllProduct(p);
				break;
			}

			case 4: {
				showNamesOfAllProduct(p);
				break;
			}

			case 5: {
				removeProduct(p);
				break;
			}

			case 6: {
				break;
			}

			}//end of switch

		}while(choice != 6);

	}//end of main

	public static void modifyProduct(Product[] prod) {

		System.out.println("Enter Which Product To Modify: ");
		int ch = sc.nextInt();
		System.out.println("Enter Which Property To Modify: ");
		System.out.println("1.name 2.description 3.unit cost 4.expiry date ");
		int ch1 = sc.nextInt();

		switch(ch1) {

		case 1: {
			System.out.println("Enter the name");
			String nm = sc.next();
			prod[ch].setName(nm);
			break;
		}
		case 2: {
			System.out.println("Enter the description");
			String des = sc.next();
			prod[ch].setDesc(des);
			break;
		}
		case 3: {
			System.out.println("Enter the unit cost");
			double cst = sc.nextDouble();
			prod[ch].setUnitCost(cst);
			break;
		}
		case 4: {
			System.out.println("Enter the expiry date seperated By dash ");
			String dt = sc.next();
			String[] dt1 = dt.split("-"); 
			prod[ch].setExpiryDate(new MyDate(Integer.parseInt(dt1[0]), Integer.parseInt(dt1[1]), Integer.parseInt(dt1[2])));
			break;
		}
		}

	}
	public static void removeProduct(Product[] p) {

		showAllProduct(p);
		System.out.println("Enter Which Product To Remove");
		int ch = sc.nextInt();
		p[ch] = null;
	}
	public static void showNamesOfAllProduct(Product[] p) {

		System.out.println("The Names Of All Products Are: ");
		for(Product prod : p)
		{
			System.out.println(prod.getName());
		}

		
	}
	public static void showTotalCostOfAllProduct(Product[]p) {

		for(Product prod : p)
		{
			System.out.println(prod.getUnitCost());
		}

	}

	public static void showAllProduct(Product[] p) {
		for(int i=0; i<10; i++)
		{
			if(p[i] != null)
			{
				
					System.out.println("Name: "+p[i].getName()+", "+ "Description: "+ p[i].getDesc() +",  "+"Cost: "+ p[i].getUnitCost()+", "+"Exp Date: "+ p[i].getExpiryDate().getYear());
				
			}
		}
	}



}
