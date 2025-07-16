package regular.second;
//11. Shift negative before positive in array
public class Eleven {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++) {
            if(arr[i]<0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            if(arr[i]>0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
