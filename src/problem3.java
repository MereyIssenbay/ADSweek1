import java.util.Scanner;
public class problem3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = sc.nextInt();
        if(findIsPrime(n)){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is composite");
        }
    }
    public static boolean findIsPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
