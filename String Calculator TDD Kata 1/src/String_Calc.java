/*
 * name : Daniel portnoy
 * id : 307889287	
 * gitHub login: danielpornoty
 * 
 * */

public class String_Calc {
	
	private String delimiters = "[,\n]+";
	
	int Add(String input)
	{	
		String[] s = input.split(delimiters);
		
		if(s[0].equals("//;"))
		{
			input = s[1];
			delimiters = "[//,\n;]+";
		}
			
		String[] numbers = input.split(delimiters);
		
		numbers = input.split(delimiters);
		
		if(isEmpty(input))
			return 0;
		else if(input.length() == 1)
			return  StringToInt(input);

		return Sum(numbers);	
		
	}

	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int StringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	private int Sum(String[] numbers)
	{
		int sum = 0;
		
		for(int i = 0 ; i < numbers.length ; i ++)
			sum += StringToInt(numbers[i]);
		
		return sum;
	}
}
