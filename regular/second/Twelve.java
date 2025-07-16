package regular.second;
//12. Find the common elements between the two arrays
public class Twelve {
    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 3, 4, 5 };
        int[] ar2 = { 3, 4, 5, 6, 7 };

        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    System.out.println(ar1[i]);
                }
            }
        }
    }
}
