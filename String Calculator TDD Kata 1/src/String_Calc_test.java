/*
 * name : Daniel portnoy
 * id : 307889287	
 * gitHub login: danielpornoty
 * 
 * */

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class String_Calc_test {
	
	
	 private String_Calc calc;

     @Before
     public void init()
     {
             calc = new String_Calc();
     }
	
	@Test
	public void EmptyStrRetZero() throws Exception
	{
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void OneNum() throws Exception
	{
		assertEquals(calc.Add("7"), 7);
	}

	@Test
	public void TwoNum() throws Exception
	{
		assertEquals(calc.Add("7,7"), 14);
	}
	
	@Test
	public void AlotOfNumbers() throws Exception
	{
		assertEquals(calc.Add("7,7,7,7"), 28);
	}
	
	@Test
	public void LinesBetweenNumbers() throws Exception
	{
		assertEquals(calc.Add("7,7\n7,7"), 28);
	}
	
	@Test
    public void SupportDifferentDelimiters() throws Exception
    {
		assertEquals(calc.Add("//;\n7;7"), 14);
    }
	
	 @Test
     public void NegNumWillThrowAnException() 
     {
             try
             {
            	 	assertEquals(calc.Add("-7"), -7);
             }
             catch(Exception e)
             {
                     System.out.println(e);
             }
     }

}
