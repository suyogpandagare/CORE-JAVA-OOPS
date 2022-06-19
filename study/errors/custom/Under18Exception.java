package study.errors.custom;

public class Under18Exception extends Exception {

	public Under18Exception() {
		super("The Employee cannot be yonger than 18 years");
	}
	
}

