package com.apple.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tail {

	public static long sleepTime = 1000;

	public static void main(String args[]) throws IOException,FileNotFoundException
	{
		if(args.length > 0){
		
			BufferedReader  input = new BufferedReader(new FileReader(args[0]));
			
			String line=null;
		
			
			while(true)
			{
			 
					
						if((line = input.readLine() )!= null)
						{System.out.println(line);
						 	continue;}
					
							try {
								Thread.sleep(sleepTime);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								Thread.currentThread().interrupt();
								e.printStackTrace();
								break;
							}
			
			}
			input.close();
			}
	else 
			System.out.println("Usage: tail filename");
	}
}

	
