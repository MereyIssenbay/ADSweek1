import java.util.Scanner;
public class problem7 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number of numbers: ");
        int n = sc.nextInt();
        System.out.print("Give numbers: ");
        reverse(n, sc);
    }
    public static void reverse(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        String element = sc.next();
        reverse(n - 1, sc);
        System.out.print(element + " ");
    }
}
