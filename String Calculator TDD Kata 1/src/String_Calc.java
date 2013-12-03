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
		
		if(isEmpty(input))
			return 0;
		else if(input.length() == 1)
		{
			return  StringToInt(input);
		}
		else
		{
			return StringToInt(numbers[0])+StringToInt(numbers[0]);
		}
	}

	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int StringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
}
