package study.threads;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {

		Thread th1 = new Thread(new Task(10));
		th1.start();
		
		//this th1 was going to ready queue and job done message was getting printed to make it wait thill th1 end we use join()
		th1.join();  //here main thread poses till th1 is completed
		System.out.println("job done thank you");
		
	}

}//end of JoinExample class

class Task implements Runnable        //Runnable is Interface and interface me saare methods abstract hoti hai i.w. we are overriding run method
{
	int range;
	Task(int r){ range = r; }
	@Override
	public void run() {

		for(int i=0; i<= range; i++)
		{
			System.out.println(i + " "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}
	}
}