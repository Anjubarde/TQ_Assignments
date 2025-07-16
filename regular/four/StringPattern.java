package regular.four;

import java.util.Scanner;
//1.Find following pattern using string methods
//Name : Sachin  Ramesh Tendulkar
//Pattern1 : S.R.T.
//Pattern2: S.R.Tendulkar
//Pattern3: Tendulkar Sachin Ramesh

//2.Take String and show following pattern
//java
//pattern :
//j
//ja
//jav
//java
public class StringPattern {
    public static void main(String[] args) {

        // Problem 1
        String fullName = "Sachin Ramesh Tendulkar";
        String[] nameParts = fullName.trim().split("\\s+");

        // Pattern 1: S.R.T.
        String pattern1 = nameParts[0].charAt(0) + "." + nameParts[1].charAt(0) + "." + nameParts[2].charAt(0) + ".";
        System.out.println("Pattern 1: " + pattern1);

        // Pattern 2: S.R.Tendulkar
        String pattern2 = nameParts[0].charAt(0) + "." + nameParts[1].charAt(0) + "." + nameParts[2];
        System.out.println("Pattern 2: " + pattern2);

        // Pattern 3: Tendulkar Sachin Ramesh
        String pattern3 = nameParts[2] + " " + nameParts[0] + " " + nameParts[1];
        System.out.println("Pattern 3: " + pattern3);

        System.out.println("--------------------------");

        // Problem 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
