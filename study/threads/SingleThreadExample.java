package study.threads;

public class SingleThreadExample {

	public static void main(String[] args) {//begineeing of main thread

	chat();
	video();
	
	}//end of main thread

	
	public static void chat()
	{
		while(true)
			System.out.println("zoom chat is running ");
	}
	
	public static void video()
	{
		while(true)
			System.out.println("zoom video is running ");
	}
}