package com.testng.examples;



public class RemoveChar {

	public static String RemoveCharInstance(String s, Character c) throws IllegalArgumentException {
		if (s == null || s.isEmpty() || c == null)
			throw new IllegalArgumentException();

		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				result += "";
			else
				result += s.charAt(i);
		}

		return result;
	}

	public static String RemoveByBuiltinFunc(String s, Character c) throws IllegalArgumentException {
		if (s == null || s.isEmpty() || c == null)
			throw new IllegalArgumentException();

		String result = s.replaceAll(c.toString(), "");
		return result;

	}

	public static void main(String args[]) throws IllegalArgumentException {
		String s = "JavaProgram";
		char c = 'a';

		String r = RemoveCharInstance(s, c);
		System.out.println(r);

		String t = RemoveByBuiltinFunc(s, c);
		System.out.println(t);

	}

}
