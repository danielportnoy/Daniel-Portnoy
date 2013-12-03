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
	public void EmptyStrRetZero()
	{
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void OneNum()
	{
		assertEquals(calc.Add("7"), 7);
	}

	@Test
	public void TwoNum()
	{
		assertEquals(calc.Add("7,7"), 14);
	}
}
