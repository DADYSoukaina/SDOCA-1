package chapter4;

public class StringClass {

	// Using new operator and string literal value "value within double quotes"
	// using =

	// Using String constructor that accept a String

	public static void space() {
		for (int i = 1; i < 20; i++)
			System.out.print("--*");
		System.out.println();
	}

	static String str1 = new String("Souka");
	static String str2 = new String("Souka");

	public static void main(String[] args) {

		// 1. Creating String objects:
		space();
		System.out.println(" 1. Creating String objects:");
		space();

		// Comparing the two String object
		// == compare the address that the object is referenced to.

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// initialize two Strings using the assignment operator =
		String str3 = "Souka1";
		String str4 = "Souka1";
		// the two objects are refer to the same object if they store the same
		// sequence of characters.
		// in a pool if string object java search for an object with the same
		// sequence of characters and refer to it this latter if java didn't
		// find one it' create a new string object.
		// the creation of a String object using assignment operator is depend
		// on the pool of string and which objects it's contains.
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

		// System.out.println(str1==str3);
		// System.out.println(str1.equals(str4));

		// create new string object with the value between quotes.
		System.out.println("Good morning");
		String string1 = "Good morning";
		// the string2 object is not placed in the constant pool string
		String string2 = new String("Good morning");
		// compare using ==
		System.out.println(string1 == "Good morning");
		System.out.println(string2 == "Good morning");
		System.out.println(string1 == string2);

		// Other overloaded constructor of class String.
		// Using String constructor that accept array of char

		char[] name = { 'b', 'o', 'y', 's' };
		String boy = new String(name);
		System.out.println(boy);

		// Create objects of String using StringBuilder and StringBuffer.
		StringBuilder sb1 = new StringBuilder("builder");
		String ssb1 = new String(sb1);
		System.out.println(ssb1);

		StringBuffer sb2 = new StringBuffer("Buffer");
		String ssb2 = new String(sb2);
		System.out.println(ssb2);

		// Counting String objects

		String Summer = new String("Summer"); // +1 :Create a new string object
												// with the value summer but it'
												// located outside the constant
												// pool(String pool)
		String Summer2 = "Summer"; // +1 create a new String object this time
									// inside the constant pool
		System.out.println("Summer"); // +0 refer to the existing object in the
										// constant pool with the value
										// "Summer".
		System.out.println("autumn"); // +1 create new object in constant pool
										// with value "autumn"
		System.out.println("autumn" == "summer"); // +1 create new object summer
													// in the pool constant (as
													// summer is different than
													// Summer "Java
													// case-sensitive") and
													// autumn refer to existing
													// object in the constant
													// pool.
		String autumn = new String("Summer"); // +1 create new object Summer

		// So the total number of String objects created is 5 objects

		// 2. Class String is immutable:
		space();
		System.out.println(" 2. Class String is immutable:");
		space();

		// String uses a private final char array to store it's value.
		String myName = "Souka";
		char[] muName = { 'S', 'o', 'u', 'k', 'a' };
		// String use final variable to store it's value:

		// private final char[] value;

		// methods of String don't modify the char array as it's a private
		// parameter.

		System.out.println("Strings are immutable.");
		System.out.println("once initialized, a string can't be modified.");
		System.out.println(
				"All the Strings methods that return a modified String value return a new String object with the modified value.");
		System.out.println("the original String value always remains the same.");

		// 3. Methods of the class String:
		space();
		System.out.println(" 3. Methods of the class String is immutable:");
		space();

		// Query the position of individual characters in a String: charAt(), indexOf(),
		// substring().

		// charAt(): retrieve a character at specified index of String.
		String chart = new String("character");
		System.out.println(chart.charAt(1));

		// indexOf(): Search a String for the occurrence of a char or string .
		// if this char or string is found, it's returns the first matching position,
		// otherwise it's returns -1.

		String letters = "ABCD";
		System.out.println(letters.indexOf('A'));
		System.out.println(letters.indexOf("CD"));
		System.out.println(letters.indexOf("AD"));
		// you can also fix the start position using the overload method of idexOf()
		System.out.println(letters.indexOf('A', 0));
		System.out.println(letters.indexOf('A', 2));

		// substring(int x): returned a substring of the character from the position
		// that u specified till the end
		// substring(int x, int y): returned a substring of the character from the start
		// position that u specified till the end position.

		String project1 = "oracle";
		System.out.println(project1.substring(3));

		String project2 = "oracle";
		System.out.println(project2.substring(2, 4));

		// Seem to modify String: substring(), trim(), replace.

		// trim(): method returns a new String by removing all the leading and trailing
		// white space (blanks: new lines, spaces, tabs) in a String.
		// trim() dosen't remove the space within a string, only at the start and the
		// end of this string.

		String trimSentence = new String("   sentence full of blank spaces   			   " + "");
		System.out.println(trimSentence.trim());

		// replace(): replace the char or String with the new one

		String replaceChar = "dadySoukaina";
		System.out.println(replaceChar.replace("dady", "ana"));
		System.out.println(replaceChar.replace('S', 's'));

		// this method doesn't and can't change the value of replaceChar

		System.out.println(replaceChar);

		// Length() to retrieve the length of String

		System.out.println("Soukaina".length());

		// startWith() endWith() determine whether a string start or end with specified
		// string or char, returns true or false

		System.out.println("Soukaina".startsWith("Sou"));
		System.out.println("Soukaina".startsWith("Sou", 4));
		System.out.println("Soukaina".endsWith("a"));

		// Method chaining: using multiple String methods at the same line

		System.out.println("Soukaina   ".replace("  ", "Da").trim().concat("dy"));

		System.out.println("Twist and tale 4.1");

		String letter = "ABCAB";
		System.out.println(letter.substring(0, 2).startsWith("A"));

		space();
		System.out.println("4.String objects and operators ");
		space();

		String aString = "I'm " + "in the chapter" + 4;
		System.out.println(aString);

		int num = 10;
		int value = 15;
		System.out.println("number" + num + value);
		System.out.println(num + value + "number"); // calculate the numbers.
		String java = "java";
		java += " is everywhere";
		System.out.println(java);

		String bString; // to use += u should initialized the variable.
		bString = null;
		System.out.println(bString += "string");

		space();
		System.out.println("5. Determinig equality of Strings ");
		space();

		String val1 = "java";
		String val2 = "jascala";

		System.out.println(val1.substring(0, 1)); // the returned value using substring is created by new operator so
													// it's refers to two diffrent objects
		System.out.println(val2.substring(0, 1));

		System.out.println(val1.substring(0, 1).equals(val2.substring(0, 1)));
		System.out.println(val1.substring(0, 1) == val2.substring(0, 1));

		// the values returned by the methods of String are not placed in String pool as
		// they created using new.
		
		space();
		
		int nums[][] = new int[3][3];
		nums[0] = new int[2]; 
		for(int i=0; i<nums.length; i++)
		System.out.println(nums[i].toString());
		System.out.println(nums[0].toString());

		space();
		
		final int[] ints = new int[3];
		int len = ints.length;
		ints[1]++;
		for(int i : ints)
			System.out.println(i);
		space();
		
		int[][]intss=new int[3][2];
		intss[0]= new int[3];
		//intss[2]= {1,2,3};
		System.out.println(intss[0].length+intss[2].length);
		
		/* methods of String don't modify the CHAR ARRAY:  
		 *  1. Query position of chars: charAt, indexOf, substring
		 *  -- charAt(int index) = retrieve a character at specified position
		 *  -- indexOf(String a) = return forst matching position if it's not exist returns -1.
		 *  -- substing(int index) = return a substring of string starting from the position specifid (index) to the end. remove the rest
		 *   or specifiend the end by using indexOf(int start, int end)
		 *  2. Seem to modify String: substring, trim, replace
		 *   -- trim() = returns new string by removing white space at the start and the end
		 *   -- replace(string original, string newOne) = return new string by replacing the characters with the new ones
		 *  3. Others: length, startsWith, endsWith
		 *   -- lentgh()
		 *   -- startsWith(String a, String position): boolean
		 *   -- endsWith(String a) : boolean
		 * 
		 */
		    
		space();
		// method chaining: use multiple String methods in a single line of code
		
		String day = "SunDday";
		day.replace('Z', 'D').substring(3);
		System.out.println(day);
		day=day.replace('Z', 'D').substring(3);
		System.out.println(day);

		String str= "ABCAB";
		System.out.println(str.substring(0,2).startsWith("A")); // prints true

		space(); //String objects and operators
		
		// concatenation implemented by using StringBuilder or StringBufer
		
		
		
	}
}
