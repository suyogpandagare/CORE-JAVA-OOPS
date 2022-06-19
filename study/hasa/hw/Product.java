package study.hasa.hw;

import study.hasa.MyDate;

public class Product {

	private String name;
	private String desc;
	private double unitCost;
	private MyDate expiryDate;
	
	public Product()
	{
		
	}
	
	public Product(String n, String d, double uc, MyDate ed)
	{
		this.name = n;
		this.desc = d;
		this.unitCost = uc;
		this.expiryDate = ed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public MyDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(MyDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
