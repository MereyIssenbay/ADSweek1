import java.util.Scanner;
public class problem8 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Give me string: ");
            String s = sc.next();
            if (isFullDigit(s)) {
                System.out.println("Yes");
            } else if (s.equals("-1")) {
                break;
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isFullDigit(String s){
        if(s.isEmpty()){
            return true;
        } else{
            boolean check = (s.charAt(s.length()-1) >= 48 && s.charAt(s.length()-1) <= 57);
            boolean rest = isFullDigit(s.substring(0,s.length()-1));

            return check && rest;
        }
    }
}
