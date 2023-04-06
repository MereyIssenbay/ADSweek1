import java.util.Scanner;
public class problem9 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me entries: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(calculate(n,k));
    }
    public static int calculate(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        else if(k == 1 || k == n-1){
            return n;
        }
        else{
            return calculate(n-1, k-1) + calculate(n-1, k);
        }
    }
}