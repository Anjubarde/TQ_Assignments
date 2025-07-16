package regular.one;
//1. Traverse the array and find the sum of odd elements in an array
public class One {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 9, 4, 6, 7, 0};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of odd elements: " + sum);
    }
}
