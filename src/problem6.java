import java.util.Scanner;
public class problem6 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a base and power: ");
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        System.out.println(calculatePowerOf(a,n));
    }
    public static int calculatePowerOf(int a, int n){
        if(n == 0){
            return 1;
        }
        else{
            return calculatePowerOf(a, n-1) * a;
        }
    }
}
