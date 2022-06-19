package study.threads;

public class ExtraExample {


	public static void main(String[] args) throws InterruptedException {

		System.out.println("Welcome the Sandip University");
		System.out.println();
		Thread.sleep(500);
		canteenThread th1=new canteenThread();
		EnggCollegeThread th2=new EnggCollegeThread();
		DiplomaCollegeThread th3=new DiplomaCollegeThread();
		PharmacyCollegeThread th4=new PharmacyCollegeThread();
		th1.setDaemon(true);
		th2.setDaemon(true);
		
		th1.start();
		
		th2.start();
		
		th2.join();
		
		th3.start();
		
		
		th3.join();
		
		th4.start();


		/*for(int i=0;i<10;i++) {
			System.out.println("Engineering college is opened");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

			for(int i=0;i<10;i++) {
				System.out.println("Diploma college is opened");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}*/


	}//end of main

}//end of class


class canteenThread extends Thread{

	@Override
	public void run() {
		while(true)
		{
			System.out.println("Canteen is Opened");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}//end of canteenThread

class EnggCollegeThread extends Thread{
	@Override
	public void run() {

		//DiplomaCollegeThread th1=new DiplomaCollegeThread();
		int count=0;
		while(count++<5)
		{
			System.out.println("Engineering college is opened");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//th1.start();
	}
}// end of EnggThread

class DiplomaCollegeThread extends Thread{
	@Override
	public void run() {
		//PharmacyCollegeThread th1=new PharmacyCollegeThread();
		int count=0;
		while(count++<5)
		{
			System.out.println("Diploma college is opened");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//th1.start();
	}
}// end diplomaThread


class PharmacyCollegeThread extends Thread{
	@Override
	public void run() {
		int count=0;
		while(count++<5)
		{
			System.out.println("Pharmacy college is opened");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


