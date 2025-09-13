package HomeWork3_TQ;

/*
1. We have one window of 200 pixel width and 300 px height.
We have long string here each character in string has size of 4 pixel and space has size of 2 pixel. We want to print string when string size reaches 200 pixel width remaining string should be starting from new line 
With word ...no incomplete word should be there in any of line. [2]
OR
1. Write a Program in Java to accept 10 number and count no of bouncy, increasing,  decreasing number.
Increasing Number : Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; for example, 22344.
Decreasing Number : Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 774410.
Bouncy Number : We shall call a positive integer that is neither increasing nor decreasing a “bouncy” number; for example, 155349. 
*/


import java.util.Scanner;

public class Question_1_ 
{

    public static boolean isIncreasing(int num) {
        int prevDigit = 10; // digit can't be >9, so start with 10 (max)
        while (num > 0) {
            int currDigit = num % 10;
            if (currDigit > prevDigit) {
                return false;
            }
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }

    public static boolean isDecreasing(int num) {
        int prevDigit = -1; // digit can't be <0, so start with -1 (min)
        while (num > 0) {
            int currDigit = num % 10;
            if (currDigit < prevDigit) {
                return false;
            }
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int increasingCount = 0;
        int decreasingCount = 0;
        int bouncyCount = 0;

        System.out.println("Enter 10 positive integers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (isIncreasing(num)) {
                increasingCount++;
            } else if (isDecreasing(num)) {
                decreasingCount++;
            } else {
                bouncyCount++;
            }
        }

        System.out.println("Increasing numbers count: " + increasingCount);
        System.out.println("Decreasing numbers count: " + decreasingCount);
        System.out.println("Bouncy numbers count: " + bouncyCount);

        sc.close();
    }
}
