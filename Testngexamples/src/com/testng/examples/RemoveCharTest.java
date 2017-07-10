package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng.examples.RemoveChar;

public class RemoveCharTest {

  @Test(expectedExceptions=IllegalArgumentException.class)
  public void testIllegalArguments() {
	  
	  RemoveChar rCh = new RemoveChar();
	  rCh.RemoveCharInstance(null,null);
	  rCh.RemoveByBuiltinFunc(null, null);
	  
	  rCh.RemoveCharInstance("", 'a');
	  rCh.RemoveByBuiltinFunc("", 'a');
	  
	  
  }


  @Test
	public void testIterativeApproach(){
		RemoveChar removeOccurences = new RemoveChar();
		String outputBasic = removeOccurences.RemoveCharInstance("javaprogram", 'a');
		Assert.assertEquals("jvprogrm", outputBasic);
		String outputWithNumber = removeOccurences.RemoveCharInstance("javaprogram123123", '1');
		Assert.assertEquals("javaprogram2323", outputWithNumber);
		String outputWithSpace = removeOccurences.RemoveCharInstance("java program string", ' ');
		Assert.assertEquals("javaprogramstring", outputWithSpace);
		String outputWithSpecialChar = removeOccurences.RemoveCharInstance("java-program-string", '-');
		Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
	}
	
  @Test
  public void testBuiltinFuncApproach(){
	  
	    RemoveChar removeOccurences = new RemoveChar();
		String outputBasic = removeOccurences.RemoveByBuiltinFunc("javaprogram", 'a');
		Assert.assertEquals("jvprogrm", outputBasic);
		String outputWithNumber = removeOccurences.RemoveByBuiltinFunc("javaprogram123123", '1');
		Assert.assertEquals("javaprogram2323", outputWithNumber);
		String outputWithSpace = removeOccurences.RemoveByBuiltinFunc("java program string", ' ');
		Assert.assertEquals("javaprogramstring", outputWithSpace);
		String outputWithSpecialChar = removeOccurences.RemoveByBuiltinFunc("java-program-string", '-');
		Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
  }
  
  
}
