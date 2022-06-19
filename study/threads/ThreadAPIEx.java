package study.threads;

public class ThreadAPIEx {

	public static void main(String[] args) {

		ChatThread th1 = new ChatThread();
		th1.setName("first");   //Thread ke constructor ke name me first store ho jaiga
		th1.start();
		
		ChatThread th2 = new ChatThread();
		th2.setName("second");
		th2.start();
		
		ChatThread th3 = new ChatThread();
		th3.setName("third");
		th3.start();
		
		Thread th4 = new Thread(new TableGenerationTask());
		th4.setName("fourth");
		th4.start();
		
		Thread th5 = new Thread(new FactorialTask());
		th5.setName("fifth");
		th5.start();
		
		
		
	}

}
