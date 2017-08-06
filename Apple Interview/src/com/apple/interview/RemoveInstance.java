package com.apple.interview;

public class RemoveInstance {

	public static void main(String args[]) {
		
		// Given String
		String inputString = "javaprogram";
		System.out.println("Input String is: "+ inputString );
		
		// Given Character
		char inputChar = 'a';

		RemoveInstance RmvIns = new RemoveInstance();

		// ItrString1 is the string that holds the manipulated String achieved through iteration.
		String ItrString1 = RmvIns.iterate(inputString, inputChar);
		System.out.println("1) Iterate through the String, one character at a time, Output is : " + ItrString1);

		// resultString2 is the string that holds the manipulated String that can be solved this in one line .
		String onelineString12 = RmvIns.builtInFusolveInOneLine(inputString, inputChar);
		System.out.println("2) Find a method in the String class that can solve this in one line, Output is : " + onelineString12);

	}

	/** Start Method -- 1) Iterate through the String, one character at a time */
	public String iterate(String inputString, Character inputChar) throws IllegalArgumentException {
		
		// Check if input string is empty or NULL
		if (inputString == null || inputString.isEmpty() || inputChar == null) {
			throw new IllegalArgumentException();
		}

		// Get the size of the length
		int strlen = inputString.length();
		
		// Use String Builder to append string
		StringBuilder outputStringBuilder = new StringBuilder();
		
		// Iterate through the String, one character at a time
		for (int i = 0; i < strlen; i++) {
			/**
			 * if the character is not equal to the given character, add that
			 * character to the ItrString1
			 */
			char currentChar = inputString.charAt(i);
			if (currentChar != inputChar) {
				outputStringBuilder.append(currentChar);
			}
		}
		return outputStringBuilder.toString();

	}

	// End of the Method - iterationMethod

	/**
	 * Start Method--2. Find a method in the String class that can solve this in one line
	 */
	public String builtInFusolveInOneLine(String inputString, Character inputChar)
			throws IllegalArgumentException {
		// Checking if input string is empty or NULL
		if (inputString == null || inputString.isEmpty() || inputChar == null) {
			throw new IllegalArgumentException();
		}
		// replace method will replace the given character with null
		String outputString = inputString.replaceAll(inputChar.toString(), "");

		return outputString;

	}
	// End of the Method - builtInFunction

}
