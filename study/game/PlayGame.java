package study.game;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		int ch;
		do {
			
			Random random = new Random();

			//GENERATING HIDDEN NUMBER
			int x = random.nextInt(20);  
			
			//CODE FOR DEVELOPER ACCESS ONLY
			//************************************************
			
			boolean devmode = false;
			try {
				devmode = Boolean.parseBoolean(args[0]);
			}
			catch (Exception e) {
				 System.out.println("GAME IS ON");
			}
			if(devmode)
			{
				System.out.println("hidden number is = "+x);
			}
			//*************************************************
			
			Game g = new Game();

			g.setHiddenNo(x);

			Scanner sc = new Scanner(System.in);


			//g.getChances();
			g.setChances(5);

			for(int i=1; i<=g.getChances(); i++)
			{
				System.out.println("Guess the number: (1-20)");
				int guessedNo = sc.nextInt();

				int num = g.isMatching(guessedNo);

				if(num==0)
				{
					System.out.println("Bingooo..You Win..!!");
					break;
				}
				if(num==-1)
				{
					System.out.println("Wrong Guess..My Number is lesser");
				}
				if(num==1)
				{
					System.out.println("Wrong Guess..My Number Is Greater");
				}
			}//for loop end
			System.out.println("Do you want to play again..?"
					+ " 1. Yes"
					+ " 2. No ");
			ch = sc.nextInt();


		}while(ch!=2);
		System.out.println("Thank You For Playing..!!");
	}

}
