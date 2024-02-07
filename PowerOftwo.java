/*
 Q3) Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return the string true if it's a power of two. If it's not return the string false.
  For example if the input is 16 then your program should return the string true but if the input is 22 then the output should be the string false.
 */
package Question1;
import java.util.*;
public class PowerOftwo 
{
	public static String powersOfTwo(int num)// powersOfTwo function to accept integer value
	{
		while (num > 1) // checks the given number is greater than 1
		{
            if (num % 2 != 0) 
            {
                return "false";
            }
           num /= 2;
        }

        return "true";
		
	}
	public static void main(String[] args) 
	{
		int num;
		String result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();// Accept input form user
		
		result=powersOfTwo(num);
		System.out.println("Reuslt is: "+result);// Result display 
	}

}
