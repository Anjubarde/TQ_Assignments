package regular.second;
//6. WAP to half sort the array in ascending and half in descending
public class Six {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int mid = n / 2;

        // Sort first half in ascending order
        for (int i = 0; i < mid - 1; i++) {
            for (int j = i + 1; j < mid; j++) {
                if (arr[i] > arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Sort second half in descending order
        for (int i = mid; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print result
        System.out.print("Half sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
