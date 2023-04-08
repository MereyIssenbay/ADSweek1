import java.util.Scanner;
public class problem1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1));
        }
    }
}
