/*
 * name : Daniel portnoy
 * id : 307889287	
 * gitHub login: danielpornoty
 * 
 * */

import static org.junit.Assert.*;

import org.junit.Test;


public class String_Calc_test {
	
	String_Calc calc = new String_Calc();
	
	@Test
	public void EmptyStrRetZero()
	{
		String_Calc calc = new String_Calc();
		assertEquals(calc.Add(""), 0);
	}

}
