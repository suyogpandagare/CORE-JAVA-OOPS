package study.threads;

public class MultiThreadEx {

	public static void main(String[] args) {

		ChatThread th1 = new ChatThread();
		th1.setPriority(Thread.MAX_PRIORITY);  
		VideoThread th2 = new VideoThread();
		th2.setPriority(Thread.NORM_PRIORITY);
		
		th1.start();  //this method will creat OS level thread and add it to ready queue
		th2.start();  //when the schedular will select the thread at that time run() execute 
		//run will get automatically get called e should not call it
		/*th1.run();  //only run method of th1 runs...
		th2.run();*/   
	}//end of main thread

}//end of multithread

class ChatThread extends Thread
{
	@Override
	public void run() {
		
		while(true) {
			System.out.println("zoom chat is running "+super.getName());  //chatthread ka super means Thread ka name print hoga
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}    
	}//exit point of run
}

class VideoThread extends Thread  //Thread is inbuilt API
{
	@Override
	public void run() {  //run will give us path of execution
		
		while(true) {
			System.out.println("zoom video is running ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}




