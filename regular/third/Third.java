package regular.third;
//3. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16},
//{34, 42, 2}} output is: 12, 5, 2.
public class Third {
    public static void main(String[] args) {
        int arr[][] = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};

        for(int i = 0; i < arr.length; i++) {
            int min = arr[0][i];
            for(int j = 1; j < arr.length; j++) {
                if(arr[j][i] < min) {
                    min = arr[j][i];
                }
            }
            System.out.print(min + " ");
        }
    }
}
