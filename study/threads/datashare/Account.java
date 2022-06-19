package study.threads.datashare;

import org.omg.Messaging.SyncScopeHelper;

public class Account {

	private int balance;	

	public Account(int balance)
	{
		this.balance = balance;
	}

	//THIS IS THREAD SAFE METHOD
	public  void deposit(int amount)
	{
		synchronized (this) {       //other way => using synchronised block
			this.balance += amount;
		}
		
	}
	
	public synchronized void withdraw(int amount)
	{
		synchronized (this) {
			this.balance -= amount;
		}
		
	}
	
	public void showBalance()
	{
		System.out.println("Current Balance = "+balance);
	}


}




