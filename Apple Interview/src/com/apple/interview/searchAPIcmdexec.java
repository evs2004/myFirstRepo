package com.apple.interview;


import java.io.*;

public class searchAPIcmdexec {

	public static String command = "iTunes-search.cmd";
	public static String[] env=null;
	public static File dir=null;
	
	public static String params="";
	
	public static String path="C:\\Users\\sattiiesh\\workspace\\searchAPIcmdexec\\";
	
	public  void exec(String cmd) throws IOException
	{
		//Run the command
		System.out.println(cmd+" is the command");
		Process p = Runtime.getRuntime().exec(cmd,env,dir);
		//Read the output of the command
		BufferedReader input = new BufferedReader( new InputStreamReader(p.getInputStream()));
		
		//Print the out put of the executed command from InputStream
		System.out.println(input.readLine());
		
		input.close();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		
		String myCmd = path+command+""+params;
		if(args.length >0 )
			
		{
			myCmd=args[0];
			
		}
		else System.out.println("Usage: searchAPIcmdexec Command");
		
		searchAPIcmdexec sapi = new searchAPIcmdexec();
		
		sapi.exec(myCmd);
		
	
	}
	

}
