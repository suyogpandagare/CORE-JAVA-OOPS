package study.threads;

import java.util.Date;

public class DaemonExample {

	public static void main(String[] args) throws InterruptedException {

		//new Time().start(); //after this it will keep printing date as it is in infinite loop so i want to stop after my main ends so i want service thread
		Time th = new Time();
		th.setDaemon(true);  //we want time thread to finish when non daemon threads are over as main ends this service thread also ends and loop stops
		th.start();
		for(int i=0 ;i<10; i++)
		{
			System.out.println(i*i);
			Thread.sleep(1000);
		} 
	}

}//end of Daemon class 

class Time extends Thread
{
	@Override
	public void run() {

	while(true) {
		System.out.println(new Date()); //toString of Date is called inbuilt class
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}