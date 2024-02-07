/*
 Q4) Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
 Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
 Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
package Question1;
import java.util.*;
public class Letterchanges 
{
	public static void letterchange(String str)
    {
    	int i;
    	char character, resultChar[]=new char[str.length()];
    	for(i=0;i<str.length();i++)
    	{
    		character=str.charAt(i);
    		
    		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
    		{
    			character=Character.toUpperCase(character);
    		}
    		else if(character=='z' || character=='Z')
    		{
    			character='a';
    		}
    		else
    		{
    			character+=1;
    		}
    		resultChar[i]=character;
    	}
    	//samarthz=tAnAsuia
    	System.out.println("Modified String: "+(new String(resultChar)));
    }
    public static void main(String[] args)
    {
    	String str;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter string: ");
    	str=sc.nextLine();
    	
    	letterchange(str);
    }

}
