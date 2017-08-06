package com.apple.interview;

import org.junit.*;

import java.io.*;

public class searchAPIcmdexecTest {

	
	public static searchAPIcmdexec sapi;
	
	public static String CURL = "c:\\Program Files\\Git\\mingw64\\bin\\curl";
	
	public static String INPUT_FILES_PATH = "C:\\Users\\sattiiesh\\searchAPI\\input\\";
	public static String OUTPUT_FILES_PATH = "C:\\Users\\sattiesh\\searchAPI\\output\\";
	public static String EXPECTED_OUT="c:\\Users\\sattiiesh\\searchAPI\\"+"expected.out";
	
	public static File INPUT = new File(INPUT_FILES_PATH);
	public static File OUTPUT = new File(OUTPUT_FILES_PATH);
	
	public static String[] IN_FILES = null;
	public static String[] OUT_FILES = null;
	
	public static String[] URL = new String[9];
	
	@BeforeClass
	public static void setupBeforeClass() throws Exception
	{
		IN_FILES = getDirFiles(INPUT);
		OUT_FILES=getDirFiles(OUTPUT);
		
	    sapi = new searchAPIcmdexec();
		
		URL[0]="https://itunes.apple.com/search?term=jack+johnson";
	}
	
	public static String[] getDirFiles(File file) 
	{
		if(file.isDirectory()==true) { return file.list(); }
		else return null;
	}
	
	public void test(int i) throws Exception
	{         String cmd = CURL+" -o "+EXPECTED_OUT +" "+ URL[i];
			  sapi.exec(cmd);
			  
			  Assert.assertNotNull(EXPECTED_OUT);
		
	}
	
	
	@Test
	public void test1() throws Exception
	{
		test(0);
	}
}
	

