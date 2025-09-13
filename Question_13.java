package HomeWork5_TQ;

/*
	Write a program to display following number series using loop. 
	5,14,23,32…..
*/

class Question_13 
{
    public static void main(String[] args) 
    {
        int start = 5;
        int diff = 9;  // constant difference
        int terms = 10; // number of terms to display

        System.out.println("Number series:");
        for(int i = 0; i < terms; i++) 
        {
            System.out.print(start + (i * diff));
            if(i < terms - 1) 
            {
                System.out.print(", ");
            }
        }
    }
}
