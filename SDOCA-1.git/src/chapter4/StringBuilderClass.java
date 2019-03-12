package chapter4;

//Mutable class

/*String builder:
 *  dealing with larger string
 *  modifying a string
 */

public class StringBuilderClass {

	public static void main(String[] args) {
		// create StringBuilder object
		
		
		//No-argument constructor with capacity of 16 characters
		StringBuilder sb1 = new StringBuilder();
		
		// constructor accept StringBuilder object with the same capacity
		StringBuilder sb2 = new StringBuilder(sb1);
		
		// constructor accept int with the capacity 50 of this int
		StringBuilder sb3 = new StringBuilder(50);

		// constructor accept a string with the capacity (str.lentgh + 16 of string = 28 )
		StringBuilder sb4 = new StringBuilder("Soukaina Dady");

/* methods of the class StringBuilder
 * 1. Query position of chars: charAt, indexOf, substring
 *  -- charAt:
 *  -- indexOf:
 *  -- substring:
 *  
 * 2. Modify String Builder
 *  -- append(): add the value at the end of stringBuilder / append(name,1,3)  starting with position 1 append 3 characters, position 1 inclusive
 *  -- insert():
 *  -- delete(): 
 *  
 *  3. Others:
 *   -- length
 *   -- trimeToSize
 *   -- setLength(): 
 *   */
		
		
	// method append call String.ValueOf() returns four-letter string "null" if a parameter is null 
	// in the absence of overriding method toString this method display the hash code.
		
	// insert and append are the same the only difference is the position of adding a data, append at the end but insert in a particular position. 	
		
		StringBuilder sb = new StringBuilder("123");
		char[] name = {'J','a','v','a'};
		sb.insert(1,name,1,3);
		
		System.out.println(sb);
		
	// delete(index1,index2)
	//deleteCharAt(int position);
	// trim() with StringBuilder generate a compilation error
	// reverse(): you can't using reverse method to reverse Substring of StringBuilder.
	// replace(): 	
	// subSequence(): dosen't modify the exixting value of a StringBuilder object.
		
	//	
		
		
		
	
		
		
		
	}

}
