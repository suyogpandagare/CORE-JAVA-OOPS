package study.threads.datashare;

public class MainThread {

	public static void main(String[] args) {
		
		Account a = new Account(5000);
		//i will pass same Account obj to allow data sharing
		DepositThread thread1 = new DepositThread(a);
		thread1.start();
		
		WithdrawThread thread2 = new WithdrawThread(a);
		thread2.start();
		
		
	}
}//end of MainThread

class DepositThread extends Thread
{
	private Account act;
	
	public DepositThread(Account a)
	{
		this.act = a;
	}
	
	@Override
	public void run() {
		int counter=5;
		while(counter-- > 0)
		{
			act.deposit(500);
			act.showBalance();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class WithdrawThread extends Thread
{
	private Account act;
	
	public WithdrawThread(Account a)
	{
		this.act = a;
	}
	
	@Override
	public void run() {
		int counter=5;
		while(counter-- > 0)
		{
			act.withdraw(100);
			act.showBalance();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}