package study.collections;

import study.hasa.MyDate;

public class Person implements Comparable<Person>{

	private String name;
	private MyDate date;
	
	
	public Person(String name, MyDate date) {
		
		this.name = name;
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public MyDate getDate() {
		return date;
	}


	public void setDate(MyDate date) {
		this.date = date;
	}


	@Override
	public int compareTo(Person o) {

		return this.name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", date=" + date + "]";
	}
	
	
	
}
