package study.wrappers;

import java.util.Scanner;

public class PasswardSettingUtility {

	public static void main(String[] args) {
		int count1=0,count2=0;
		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a Passward: ");
			String pass = sc.next();
			System.out.println("Re-Enter a Passward: ");
			String pass1 = sc.next();
			if(pass1.equals(pass))
			{
				int flag=0;
				if(Character.isUpperCase(pass.charAt(0)))  
				{
					flag++;
					for(int i=0;i<pass.length();i++)
					{
						char ch=pass.charAt(i);
						if(Character.isUpperCase(ch))
						{
							count1++;
						}
						if(Character.isDigit(ch))
						{
							count2++;
						}
					}

					if(count1==0)
					{
						System.out.println("give atleast 1 uppercase character");
					}
					if(count2==0)
					{
						System.out.println("give atleast 1 digit");
					}
				}
				if(flag==0)
				{
					System.out.println("Enter Uppercase Letter First");
				}

			}
			else
				System.out.println("Passward Mismatch...!");
		}while(count1==0 || count2==0);

		System.out.println("Congrats ..Your Passward Is Strong..");
	}
}

