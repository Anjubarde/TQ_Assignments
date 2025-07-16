package regular.second;

//8. WAP to replace the negative elements in an array with immendiate left elements square
//ar={1,2,-3,2,-4,-6}
//o/p={1,2,4,2,4,16}
//here -> -3 is replaced by square of 2 which is 4

public class Eight {
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 2, -4, -6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i - 1] * arr[i - 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
