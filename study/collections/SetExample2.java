package study.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {

		TreeSet<Dummy> ts = new TreeSet<Dummy>();
		
		ts.add(new Dummy(12, "Suyog"));
		ts.add(new Dummy(15, "Shreysh"));
		ts.add(new Dummy(30, "Abhi"));
		ts.add(new Dummy(12, "Suyog"));
		ts.add(new Dummy(17, "Himu"));
		
		for (Dummy dummy : ts) {
			System.out.println(dummy);
		}
		
		
		
	}//end of main

}//end of class

class Dummy implements Comparable<Dummy>
{
	private int Id;
	private String name;
	
	public Dummy(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dummy [Id=" + Id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Dummy o) {

		return this.getName().compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object obj) {

	Dummy d = (Dummy) obj;
	if(d.Id == this.Id && d.name.equals(this.name))
		return true;
	else
		return false;
	}
	
	
	@Override
	public int hashCode() {

	String x = Id+name;
	return x.hashCode();
	
	}
	
}//end of class Dummy

class IDOrdering implements Comparator<Dummy>
{

	@Override
	public int compare(Dummy o1, Dummy o2) {

		if(o1.getId() > o2.getId()) return 1;
		if(o1.getId() < o2.getId()) return -1;
		else
			return 0;
		
	}
	
}
