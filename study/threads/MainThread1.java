package study.threads;

public class MainThread1 {

	public static void main(String[] args) {

		TableGenerationTask task1 = new TableGenerationTask();
		
		Thread thread1 = new Thread(task1); //here task1 is Runnable and start method is in Thread class iw. we are making thread1 of Thread class 
		thread1.start();
		
		FactorialTask ft = new FactorialTask();
		Thread thread2 = new Thread(ft);
		thread2.start();
		//now this two threads will run in round robin
	}

}
