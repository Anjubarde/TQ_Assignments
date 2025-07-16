package regular.one;
//4. Find the maximum number in an array
public class Four {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 9, 4, 6, 7, 0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number: " + max);
    }
}
