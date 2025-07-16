package regular.second;
//13. Print alternate prime number in an array
public class Thirteen {

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 11, 13, 17, 19};

        boolean print = true;

        System.out.print("Alternate prime numbers: ");
        for (int num : arr) {
            if (isPrime(num)) {
                if (print) {
                    System.out.print(num + " ");
                }
                print = !print;
            }
        }
    }
}
