
package HomeWork5_TQ;
/*
	12. Write a Java program to find how many times second character in string is present Eg
	"ooty" then o is present 2 times & "best" e is present 1 time
*/


public class Question_12 
{
    public static void main(String[] args) 
    {
        String input = "ooty";  // You can change this to test with other strings

        if(input.length() < 2) 
        {
            System.out.println("Input string must have at least 2 characters.");
            return;
        }

        char secondChar = input.charAt(1);
        int count = 0;

        for(int i = 0; i < input.length(); i++) 
        {
            if(input.charAt(i) == secondChar) 
            {
                count++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Second character: '" + secondChar + "'");
        System.out.println("'" + secondChar + "' is present " + count + " time(s) in the string.");
    }
}
