import java.util.Scanner;
public class problem1 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum: ");
        System.out.println(findMin(arr, n));
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1));
        }
    }
}
