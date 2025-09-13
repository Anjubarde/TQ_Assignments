package HomeWork5_TQ;
import java.util.*;
/*
	11. Can we read from Set using for traditional loop, if yes show how?
*/


public class Question_11
{
    public static void main(String[] args) 
    {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Convert Set to Array
        String[] fruitArray = fruits.toArray(new String[0]);

        // Read using traditional for loop
        System.out.println("Reading Set using traditional for loop:");
        for(int i = 0; i < fruitArray.length; i++) 
        {
            System.out.println(fruitArray[i]);
        }
    }
}
