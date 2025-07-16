package regular.one;

import java.util.Scanner;

//3. Search the element in an array
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
