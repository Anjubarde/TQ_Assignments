package regular.third;
//2. WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16},
//{34, 42, 2}} output is: 34, 42, and 16.
public class Two {
    public static void main(String[] args) {
        int arr[][] = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};

        for(int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
