import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, choose the problem number to check: ");
        for(int i = 1; i<=10; i++) System.out.println(i + ") Problem " + i);
        System.out.println("Type -1 to exit");
        int problem = sc.nextInt();
        switch (problem){
            case -1:
                System.exit(0);
            case 1:
                problem1.main();
                break;
            case 2:
                problem2.main();
                break;
            case 3:
                problem3.main();
                break;
            case 4:
                problem4.main();
                break;
            case 5:
                problem5.main();
                break;
            case 6:
                problem6.main();
                break;
            case 7:
                problem7.main();
                break;
            case 8:
                problem8.main();
                break;
            case 9:
                problem9.main();
                break;
            case 10:
                problem10.main();
                break;
            default:
                System.out.println("Out of range!!!");
                break;
        }
    }
}