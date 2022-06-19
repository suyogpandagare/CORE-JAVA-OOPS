package study.basics.maths;

public class Calculator {

	public static int calculate(int num1, int num2, char operator)
	{

		switch(operator)
		{
		case '+':{
			int sum = num1 + num2;
			return sum;
		}

		case '-':{
			int diff = num1 - num2;
			return diff;
		}

		case '*':{
			int mul = num1 * num2;
			return mul;
		}

		case '/':{
			int div = num1 / num2;
			return  div;
		}

		case '%':{
			int mod = num1 % num2;
			return mod;
		}

		default:{
			return -1;
		}
		
		}//switch end
	
	}//function end


}//class end











