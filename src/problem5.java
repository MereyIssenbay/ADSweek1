import java.util.Scanner;
public class problem5 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("give a positive integer (or negative to quite): ");
            int n = sc.nextInt();
            if(n >= 0) {
                System.out.println(findFibonacci(n));
            }
            else{
                System.out.println("bye");
                break;
            }
        }
    }
    public static int findFibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return findFibonacci(n-1)+findFibonacci(n-2);
        }
    }
}
