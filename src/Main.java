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
                System.out.println("Give a number of elements: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Give elements: ");
                for(int i = 0; i < n;i++){
                    arr[i] = sc.nextInt();
                }
                System.out.println("Minimum: ");
                System.out.println(problem1.findMin(arr, n));
                break;
            case 2:
                System.out.println("Give a number of elements: ");
                n = sc.nextInt();
                arr = new int[n];
                System.out.println("Give elements: ");
                for(int i = 0; i < n;i++){
                    arr[i] = sc.nextInt();
                }
                System.out.println("Average: ");
                System.out.println(problem2.findAvg(arr,n));
                break;
            case 3:
                System.out.println("Give a number: ");
                n = sc.nextInt();
                if(problem3.findIsPrime(n)){
                    System.out.println(n + " is prime");
                }
                else {
                    System.out.println(n + " is composite");
                }
                break;
            case 4:
                System.out.println("give a number: ");
                n = sc.nextInt();
                if(n >= 0) {
                    System.out.println(problem4.findFactorial(n));
                }
                else{
                    break;
                }
                break;
            case 5:
                System.out.println("give n-th term: ");
                n = sc.nextInt();
                System.out.println(problem5.findFibonacci(n));
                break;
            case 6:
                System.out.println("Give a base and power: ");
                int a = sc.nextInt();
                n = sc.nextInt();
                System.out.println(problem6.calculatePowerOf(a,n));
                break;
            case 7:
                System.out.print("Give the number of numbers: ");
                n = sc.nextInt();
                System.out.print("Give numbers: ");
                problem7.reverse(n, sc);
                break;
            case 8:
                System.out.println("Give me string: ");
                String s = sc.next();
                if (problem8.isFullDigit(s)) {
                    System.out.println("Yes");
                } else if (s.equals("-1")) {
                    break;
                } else {
                    System.out.println("NO");
                }
                break;
            case 9:
                System.out.println("Give me n and k(n>=k): ");
                n = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(problem9.calculate(n,k));
                break;
            case 10:
                System.out.println("Give me two integers to find gcd: ");
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(problem10.findGCD(n,k));
                break;
            default:
                System.out.println("Out of range!!!");
                break;
        }
    }
}