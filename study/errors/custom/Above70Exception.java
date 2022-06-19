package study.errors.custom;

public class Above70Exception extends RuntimeException {

	public Above70Exception()
	{
		super("The Employee cannot be elder than 70 years");  //call to super class constructor
	}
}
