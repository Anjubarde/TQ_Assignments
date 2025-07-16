package regular.second;

//9. Shift all zeros in the beginning of array/ Shift zeros at end

public class Nine {
    public static void main(String[] args) {
        int arr[] = {1, 0, 6, 5, 7, 2, 1, 0, 1, 0, 3};

        int newArr[] = new int[arr.length];
        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            } else {
                newArr[i-zeroCount] = arr[i];
            }
        }

        for(int i = arr.length-zeroCount; i < arr.length; i++) {
            newArr[i] = 0;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
