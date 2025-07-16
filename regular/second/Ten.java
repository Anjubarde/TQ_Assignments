package regular.second;
//10. Shift even before odd
public class Ten {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int ans[] = new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                ans[j++] = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2!=0) {
                ans[j++] = arr[i];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
