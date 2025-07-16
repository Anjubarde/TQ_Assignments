package extra.second.practice.practice;

import java.util.Scanner;

//2)Frequency of each digit in a number
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count[] = new int[10];
        int rem, rev = 0, temp = num;
        while (num != 0) {
            rem = num % 10;
            count[rem]++;
            num = num / 10;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) {
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}
