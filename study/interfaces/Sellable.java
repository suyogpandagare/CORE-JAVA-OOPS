package study.interfaces;

public interface Sellable {

	
	//by default each method is public abstract
	String getProductInfo();
	
	public abstract double getProductSellingPrice();
	
	//like menu card in hotel apan wo menu card nahi khate..mane card is interface according to this menu shef will make memu and user will get item...shef is implemented method 
	//interfaces are like menu card 
}

//Toy Is A Sellable
class Toy implements Sellable,Packable
{

	private String name;
	private double cost,discount;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Toy(String name, double cost, double discount) {
		super();
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	@Override
	public String getProductInfo() {
		
		return "Name of Toy: "+name+", "+" Cost: "+cost;
	}

	@Override
	public double getProductSellingPrice() {
		double sp = cost - (discount*cost/100);
		return sp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of Toy: "+name;
	}

	@Override
	public String getPackingDetails() {

		return "cardboard box packing";
	}
}//end of Toy class


//Laptop is a Sellable
class Laptop implements Sellable,Packable
{
	String brand,cpu,ramsize,hdsize;
	double cost,gst;

	

	public Laptop(String brand, String cpu, String ramsize, String hdsize, double cost, double gst) {
		super();
		this.brand = brand;
		this.cpu = cpu;
		this.ramsize = ramsize;
		this.hdsize = hdsize;
		this.cost = cost;
		this.gst = gst;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	public String getHdsize() {
		return hdsize;
	}

	public void setHdsize(String hdsize) {
		this.hdsize = hdsize;
	}

	@Override
	public String toString() {

		return brand+" "+cpu;
	}
	
	@Override
	public String getProductInfo() {

		return "Brand: "+brand+", "+ "Ram Size: "+ramsize+", "+"Hard Disk: "+hdsize+", "+"Cost: "+cost;
	}
	
	@Override
	public double getProductSellingPrice() {
		double sp = cost + (cost*gst/100);
		return sp;
	}

	@Override
	public String getPackingDetails() {

		return "Pack with thermacol and bubbleplastic in a cardboard Box";
	}
	
}

class IceCream implements Sellable ,Packable
{
	private String flavour;
	private String type;
	private int cost;
	public IceCream(String flavour, String type, int cost) {
		super();
		this.flavour = flavour;
		this.type = type;
		this.cost = cost;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Type of Ice-cream: "+type;
	}
	@Override
	public String getPackingDetails() {
		// TODO Auto-generated method stub
		return "Should be packed in a insulated Box";
	}
	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Type of Ice-cream: "+type+", "+ "Flavour: "+ flavour+", "+"Cost: "+cost;
	}
	@Override
	public double getProductSellingPrice() {

			double sp = cost;
		return sp;
	}
	
	
}

class Clothes implements Sellable ,Packable
{
	private String typeOfCloth;
	private String pattern;
	private double cost;
	private float discount;
	
	public Clothes(String typeOfCloth, String pattern, double cost, float discount) {
		super();
		this.typeOfCloth = typeOfCloth;
		this.pattern = pattern;
		this.cost = cost;
		this.discount = discount;
	}
	public String getTypeOfCloth() {
		return typeOfCloth;
	}
	public void setTypeOfCloth(String typeOfCloth) {
		this.typeOfCloth = typeOfCloth;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return typeOfCloth+ " "+ cost;
	}
	@Override
	public String getPackingDetails() {
		// TODO Auto-generated method stub
		return "Should be packed in polythene Bag";
	}
	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return "Type of Cloth: "+typeOfCloth+", "+ "Pattern: "+pattern+", "+"Cost: "+cost;
	}
	@Override
	public double getProductSellingPrice() {
		double sp = cost + (cost*discount/100);
		return sp;
	}
	
	
}







































