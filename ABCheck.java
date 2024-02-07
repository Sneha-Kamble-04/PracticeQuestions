/*
 Q1) Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places anywhere 
 in the string at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
  Otherwise return the string false.
 */
package Question1;
import java.util.*;
public class ABCheck 
{
	public static void main(String[] args) 
    {
    	String string,result;
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter string you want to check: ");// String take input from input
        string=sc.nextLine();
        result=ABCheck(string);
        System.out.println("Result is: "+result);
    }

    static String ABCheck(String str) // ABCheck function for string parameter
    {
        str = str.toLowerCase();// convert string into lower case
     // Iterate through the string to check for "a" and "b" separated by exactly 3 places
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'a') 
            {
                if ((i + 4) < str.length() && str.charAt(i + 4) == 'b')  // subtracting 4 to avoid index out of range
                {
                    return "true";
                }
            }
        }
        return "false";// If no match is found, return "false"
    }

}
