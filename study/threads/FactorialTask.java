package study.threads;

public class FactorialTask implements Runnable {
	
	//in runnable run method is abstract i.w.we 've to either make this method abstract or add unimplemented methods
	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();  //making thread object to call getName() as this call implements Runnable and there is not getName() method in Runnable using currentThread() method
		for(int i=0; i<=10; i++)
		{
			long fact=1;
			for(int j=2; j<=i; j++)
			{
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+"="+fact+" "+ currentThread.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for loop end
	}

	
}
