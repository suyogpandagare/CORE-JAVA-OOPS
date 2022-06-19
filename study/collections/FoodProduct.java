package study.collections;

import study.hasa.MyDate;

public class FoodProduct implements Comparable<FoodProduct>{

	private String name;
	private String brand;
	private MyDate expDate;
	private int cost;
	private String desc;
	private int fatPer;
	private int proteinPer;
	private int carbPer;
	private int calories;
	
	public FoodProduct()
	{
		
	}

	public FoodProduct(String name, String brand, MyDate expDate, int cost, String desc, int fatPer, int proteinPer,
			int carbPer, int calories) {
		super();
		this.name = name;
		this.brand = brand;
		this.expDate = expDate;
		this.cost = cost;
		this.desc = desc;
		this.fatPer = fatPer;
		this.proteinPer = proteinPer;
		this.carbPer = carbPer;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public MyDate getExpDate() {
		return expDate;
	}

	public void setExpDate(MyDate expDate) {
		this.expDate = expDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getFatPer() {
		return fatPer;
	}

	public void setFatPer(int fatPer) {
		this.fatPer = fatPer;
	}

	public int getProteinPer() {
		return proteinPer;
	}

	public void setProteinPer(int proteinPer) {
		this.proteinPer = proteinPer;
	}

	public int getCarbPer() {
		return carbPer;
	}

	public void setCarbPer(int carbPer) {
		this.carbPer = carbPer;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "FoodProduct [name=" + name + ", brand=" + brand + ", expDate=" + expDate + ", cost=" + cost + ", desc="
				+ desc + ", fatPer=" + fatPer + ", proteinPer=" + proteinPer + ", carbPer=" + carbPer + ", calories="
				+ calories + "]";
	}

	@Override
	public int compareTo(FoodProduct o) {

		
		return this.getExpDate().compareTo(o.getExpDate());
	}
	
	
	
}
