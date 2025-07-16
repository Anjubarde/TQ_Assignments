package regular.one;
//2. Print cube of each number in array
public class Two {
    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 2, 1, 3, 5, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] * arr[i] + " ");
        }
    }
}
