import java.util.Scanner;
public class problem7 {
    public static void reverse(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        String element = sc.next();
        reverse(n - 1, sc);
        System.out.print(element + " ");
    }
}
