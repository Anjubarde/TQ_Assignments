package extra.third.practice;

//Write a program to sort an array
public class Two {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 9, 4, 6, 7, 0};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
