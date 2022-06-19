package study.collections;

public class NoGuestException extends Exception{

	public NoGuestException()
	{
		super("No Guest Available In Your List");
	}
}
