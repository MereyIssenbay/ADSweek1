import java.util.Scanner;
public class problem2 {
    public static float findAvg(int[] arr, int n) {
        float avg = 0;
        for(int i = 0; i < n;i++){
            avg = avg + arr[i];
        }
        return avg/n;
    }
}
