package regular.third;
//1. WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}}
//output is: 9 and 12.
public class One {

    public static void main(String[] args) {
        int arr[][] = {{22, 31, 9}, {12, 25, 16}};

        for(int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print(min + " ");
        }
    }
}
