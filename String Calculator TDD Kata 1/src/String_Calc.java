/*
 * name : Daniel portnoy
 * id : 307889287	
 * gitHub login: danielpornoty
 * 
 * */

public class String_Calc {
	
	private String delimiters = "[,\n]+";
	
	int Add(String input) throws Exception
	{	
		if(isEmpty(input))
			return 0;
		
		String[] s = input.split(delimiters);
		
		char c;
		
        try
        {
        	StringToInt(s[0]);
        }
        catch(NumberFormatException e)
        {
                c=s[0].charAt(2);
                s[1]=s[1].replace(c, ',');            
                input = s[1];              
        }
			
		String[] numbers = input.split(delimiters);
		
		String neg_nums="";
		
		for (int i=0 ; i<numbers.length ; i++)
		{
			if( StringToInt(numbers[i]) < 0 )
					neg_nums += numbers[i] + " ";
		}
		
		if(isEmpty(neg_nums) == false)
			throw new Exception("negatives not allowed " + neg_nums);
				
		if(input.length() == 1)
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
