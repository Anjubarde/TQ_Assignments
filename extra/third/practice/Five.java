package extra.third.practice;
//WAP to find second highest number w/o sorting an array
public class Five {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 9, 4, 6, 7, 0};

        int max = arr[0], secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second highest number: " + secondMax);
    }
}
