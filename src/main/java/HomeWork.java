import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6, 8, 768, 3, 452, 35, 8, 0};
        int[] arr2 = {1,2,3,4,9,4,3,2,10};
        reversArray();
        numbersArray();
        arrayFunction();
        arraySquare();
        arrayArguments(6,7);
        arrayMinMax(arr1);
        System.out.println(arrayRightSumLeftSum(arr2));

    }

    public static void reversArray() {
        int[] arr = {1, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(arr) + " ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else if (arr[i] == 1) {
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr) + " ");
    }

    public static void numbersArray() {
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayFunction() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arraySquare() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j]++;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayArguments(int len, int intialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = intialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static boolean arrayRightSumLeftSum( int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}