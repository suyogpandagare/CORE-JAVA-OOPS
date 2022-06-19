 package study.threads;

public class TableGenerationTask implements Runnable {

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();   //Thread class me currrentThread() method hai which is static i.w. we are calling it by class name
		for(int j=2; j<=10; j++)
		for(int i=1; i<=10; i++)
		{
			System.out.println(j+"*"+i+"="+j*i+ " "+currentThread.getName());  //no getName available in Runnable so calling by making object of Thread
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
