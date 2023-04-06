import java.util.Scanner;
public class problem4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("give a number: ");
            int n = sc.nextInt();
            if(n >= 0) {
                System.out.println(findFactorial(n));
            }
            else{
                break;
            }
        }
    }
    public static int findFactorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * findFactorial(n-1);
        }
    }
}
