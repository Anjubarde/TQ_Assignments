package regular.second;

//7. WAP to left rotate the array
//ar={1,2,3,4,5}
//o/p: {3,4,5,1,2}

public class Seven {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;

        k = k % n;

        // Step 1: Create temp array to store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift remaining elements to the left
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        // Step 3: Copy temp elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // Print rotated array
        System.out.print("Left rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
