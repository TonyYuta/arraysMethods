package org.sqa.arraysMethods;

/**
 * java method that takes a character array and returns a character array containing the same elements but in reverse order
 *
 */
public class InverseArray 
{
    public static void main( String[] args ) {
    	char[] charArray = { 'a', 'x', 'y', 'd', 'd' };
      	System.out.println(reverseArray(charArray)); 
    }
    
    public static char[] reverseArray(char[] charArray) {
    	char[] reversed = new StringBuilder(new String(charArray)).reverse().toString().toCharArray();
    	return reversed;
    }
}
