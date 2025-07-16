package extra.third.practice;
//WAP to find sum of even elements in array
public class One {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 4, 6, 9};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of even elements: " + sum);
    }
}
