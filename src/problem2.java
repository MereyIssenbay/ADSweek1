import java.util.Scanner;
public class problem2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: ");
        System.out.println(findAvg(arr,n));
    }
    public static float findAvg(int[] arr, int n) {
        float avg = 0;
        for(int i = 0; i < n;i++){
            avg = avg + arr[i];
        }
        return avg/n;
    }
}
