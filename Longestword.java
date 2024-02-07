/*
 Q2) Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
 If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
 Words may also contain numbers, for example "Hello world123 567"
 */
package Question1;
import java.util.*;
public class Longestword 
{
	public static void longestWord(String sentence)
	{
		String words = "",longWord="";
		int i;
		char character;
		
		sentence+=" ";		//add space after end of the string
		
		for (i = 0; i < sentence.length(); i++) 
		{
			character = sentence.charAt(i);
			if (character == ' ') 
			{
                if (words.length() > longWord.length())
                    longWord = words;   
                words = "";
           }
           else 
           {
               words += character;
           }
	     }
		// Display the result
        System.out.println("Longest word: " + longWord);
        System.out.println("Length of the longest word: " + (longWord.length()));
    }
	public static void main(String[] args) 
	{
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		sentence = sc.nextLine();
		longestWord(sentence);
	}

}
