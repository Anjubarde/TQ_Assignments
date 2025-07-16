package regular.third;
//4.WAP to create transpose of a matrix (transpose is converting rows to columns) and print it.
public class Four {
    public static void main(String[] args) {
        int arr[][] = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};

        int transpose[][] = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i < transpose.length; i++) {
            for(int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
