package study.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Users {

	static TreeMap<String, String> userInfo = new TreeMap<String, String>();
	
	static Scanner sc = new Scanner(System.in);
	public Users()
	{
		userInfo.put("suyoggg", "suyog@123");
		userInfo.put("shreyyy", "shreyash@123");
		userInfo.put("sankk", "sanket@123");
	}
	
	public static void LogIn()
	{
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter old passward");
		String pwd = sc.next();
		
		if(userInfo.containsKey(uname) && userInfo.containsValue(pwd))
		{
			System.out.println("Welcome...!!");
		}
		else
			System.out.println("Inavlid Username or Passward");
			
	}
	
	public static void SignUp()
	{
		System.out.println("Enter UserName: ");
		String uname = sc.next();
		System.out.println("Enter Passward: ");
		String pwd = sc.next();
		
		userInfo.put(uname, pwd);
		System.out.println("User Added Successfully...!!");
	}
	
	public static void showAllUserNames()
	{
		Set<String> uname = userInfo.keySet();
		Iterator<String> iter = uname.iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			String value = userInfo.get(key);
			System.out.println("UseraName - "+key+"  "+"Passward - "+value);
		}
	}
	
	
	
	public static void changePasward() throws UnAuthorisedException
	{
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter old passward");
		String pwd = sc.next();
		
		if(userInfo.containsKey(uname) && userInfo.containsValue(pwd))
		{
			System.out.println("Enter new Passward");
			String newpwd = sc.next();
			
			userInfo.put(uname, newpwd);
			System.out.println("Passward Updated Successfully");
		}
		else
			
				throw new UnAuthorisedException();
			
		
	}
	
	public static void removeEntry() throws UnAuthorisedException
	{
		System.out.println("Enter UserName to remove: ");
		String uname = sc.next();
		System.out.println("Enter Passward: ");
		String pwd = sc.next();
		
		if(userInfo.containsKey(uname) && userInfo.containsValue(pwd))
		{
			userInfo.remove(uname, pwd);
			System.out.println("User Removed Successfully");
		} else
			
				throw new UnAuthorisedException();
			
	}

}

