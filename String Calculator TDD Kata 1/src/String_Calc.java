/*
 * name : Daniel portnoy
 * id : 307889287	
 * gitHub login: danielpornoty
 * 
 * */

public class String_Calc {

	int Add(String input)
	{		
		String[] numbers = input.split(",");
		
		int sum = 0;
		
		if(isEmpty(input))
			return 0;
		else if(input.length() == 1)
		{
			return  StringToInt(input);
		}
		else
		{
			for(int i = 0 ; i < numbers.length ; i ++)
				sum += Integer.parseInt(numbers[i]);
		}
		return sum;
	}

	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int StringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	private int Sum(String n1 , String n2)
	{
		return StringToInt(n1)+StringToInt(n2);
	}
}
