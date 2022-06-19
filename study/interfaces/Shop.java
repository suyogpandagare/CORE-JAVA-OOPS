package study.interfaces;


public interface Shop {

	public static void main(String[] args) {
		
		//Sellable obj = new Sellable();
		
		Sellable []arr = new Sellable[4];
		arr[0] = new Toy("Car", 300, 10);
		arr[1] = new Laptop("Lenovo", "intel", "8-GB", "1-TB", 60000, 12);
		arr[2] = new IceCream("Butter-scotch", "Candy", 20);
		arr[3] = new Clothes("Cotton", "Full-Sleeves", 699, 25);
	
		showBill(arr);
	}
	
	//ab kitne bhi class add kie to change krne ke jarurat nahi
	public static void showBill(Sellable[] purchases)
	{
		double total=0;
		for (Sellable s : purchases) {
			
			double sp = s.getProductSellingPrice();
			System.out.println(s.getProductInfo()+" "+"Selling Price: "+sp);
			total+=sp;
		}
		System.out.println("total bill = "+total+"\n");
	}

}