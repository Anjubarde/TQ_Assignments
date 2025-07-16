package regular.second;
//15. WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2]
//So output array is [6, 23, 67, 39, 10, 2, 5].
public class Fifteen {
    public static void main(String[] args) {
        int[] arr = {5, 6, 23, 67, 39, 10, 2};
        int n = arr.length;

        // Store first element
        int first = arr[0];

        // Shift elements to left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put first element at the end
        arr[n - 1] = first;

        // Print shuffled array
        System.out.print("Shuffled array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
