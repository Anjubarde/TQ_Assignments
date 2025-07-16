package regular.second;
//14. Write a Java program to find a missing number in an array. Means e.g. array has 1
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5
public class Fourteen {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int n = arr.length;

        int sum = (n + 1) * (n + 2) / 2;

        for (int i = 0; i < n; i++) {
            sum = sum - arr[i];
        }

        System.out.println("Missing number is " + sum);
    }
}
