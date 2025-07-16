package regular.third;
//5. WAP to subtract two matrices.
public class Five {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr1[][] = {{5, 2, 0}, {1, 4, 6}, {3, 8, 9}};

        int result[][] = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j] - arr1[i][j];
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
