package study.hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Message[] mess = new Message[5];

		mess[0] = new Message("Suyog","Abhi","Bhai Kya Haal Hai ",new Address("Panchwati", "Amravati", "Maharashtra", "India", 444602));
		mess[1] = new Message("Shr","Abhi"," Ke Halchal",new Address("Rathi Naar", "Akola", "Maharashtra", "India", 444603));
		mess[2] = new Message("Suyog","Abhi","Kem Cho",new Address("Kathora naka", "Achalpur", "Maharashtra", "India", 444604));
		mess[3] = new Message("Suyog","Abhi"," Kasa Aahes Bhava",new Address("Irwin", "Paratwada", "Maharashtra", "India", 444605));
		mess[4] = new Message("Suyog","Abhi","How r u Bro",new Address("Badnera", "Morshi", "Maharashtra", "India", 444606));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a City Name: ");
		String cname = sc.next();
		for(int i=0; i<mess.length; i++)
		{
			if(mess[i].getReceiverAddress().getCity().equals(cname))
			{
				System.out.println("The Message Is: ");
				System.out.println(mess[i].getMessage());
			}
		}

	}

}
