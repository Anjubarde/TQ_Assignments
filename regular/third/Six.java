package regular.third;
//6.WAP to find sum of each row and column of a matrix.
public class Six {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
            sum = 0;
        }
        for(int i = 0; i < arr[0].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + ": " + sum);
            sum = 0;
        }
    }
}
