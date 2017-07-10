package com.testng.examples;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class searchAPI {
	
	/**
	 This class allows executing external command 
	 */

		
		public static String[] env = null; 
		public static File dir = null;
		
		public static String path ="c:\\Users\\sattiieshh\\workspace\\searchAPI";
		
//		public static String command = "curl.exe";
		public static String command = "iTunes-searchAPI.cmd";
		
//		public static String params = "--help";
		public static String params = "";
		
		BufferedReader  pInput;
		
		public void exec(String cmd) {
			String sin = null;
			try {
				System.out.println("Command: " + cmd);
				Process p = Runtime.getRuntime().exec(cmd, env, dir);
				pInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((sin = pInput.readLine()) != null) {
					System.out.println(sin);
				}
				pInput.close();
			}
			catch (IOException ioe) {
				System.out.println(ioe.getStackTrace());
				System.exit(-1);
			}
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			String MyCmd = path + command + " " + params;
			if (args.length < 1) {
				System.out.println("Usage: java SearchAPI commandName");
				System.out.println("Running demo version with default params");
			}
			else {
				MyCmd = args[0];
			}
			
			searchAPI mc = new searchAPI();
			mc.exec(MyCmd);
		}
	}

